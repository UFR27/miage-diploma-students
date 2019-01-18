package fr.pantheonsorbonne.miage;

//imports unused removed
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.NoSuchElementException;


import org.glassfish.grizzly.http.io.NIOOutputStream;
import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;


import com.google.common.collect.Iterables;
import com.google.common.io.ByteStreams;

/**
 * Main class.
 *
 */
public class Main {
	//public static final String HOST = "localhost";
	//public static final int PORT = 7000;
	//private static final Logger logger = Logger.getLogger(Main.class.getName());
	private static StudentRepository studentRepo = StudentRepository.withDB("src/main/resources/students.db");


	//exception unused removed
	public static void main(String[] args)  {

		HttpServer server = HttpServer.createSimpleServer();
		addRootPath(server, "/home");
		addDiplomaPath(server, "/diploma/*");

		try

		{
			server.start();
			java.awt.Desktop.getDesktop().browse(new URI("http://localhost:8080/home"));
			System.out.println("Press any key to stop the server...");
			System.in.read();
		} catch (Exception e) { //exception non used
			System.err.println(e);
		}
	}

	private static Student getStudentData(int studentId, StudentRepository repo) {
		// create an arrayList of the students, because iterables are too hard
		ArrayList<Student> students = new ArrayList<>();
		Iterables.addAll(students, repo);

		//index changed to get the appropriate name
		for (int i = 1; i <= students.size(); i++) {
			if (i == studentId) {
				return students.get(i-1);
			}
		}

		throw new NoSuchElementException();

	}

	private static void handleResponse(Response response, int studentId) throws IOException {

		response.setContentType("application/pdf");

		Student student = getStudentData(studentId, studentRepo);

		DiplomaGenerator generator = new MiageDiplomaGenerator(student);
		try (InputStream is = generator.getContent()) {
			try (NIOOutputStream os = response.createOutputStream()) {
				ByteStreams.copy(is, os);
			}

		}
		//return;
	}

	private static void addDiplomaPath(HttpServer server, String path) {
		server.getServerConfiguration().addHttpHandler(new HttpHandler() {
			public void service(Request request, Response response) throws Exception {
				// get the id of the student
				int id = Integer.parseInt(request.getPathInfo().substring(1));

				handleResponse(response, id);
				response.setContentType("text/html; charset=utf-8");
				response.setStatus(404);
				response.getWriter().write("Erreur 404 : Le diplome n'existe pas pour cet utilisateur");

			}
		}, path);
	}

	private static void addRootPath(HttpServer server, String path) {
		server.getServerConfiguration().addHttpHandler(new HttpHandler() {
			public void service(Request request, Response response) throws Exception {

				StringBuilder sb = new StringBuilder();
				sb.append("<!DOCTYPE html><head><meta charset='utf-8'></head><body><h1>Liste des diplômés</h1><ul>");
				for (Student stu : StudentRepository.withDB("src/main/resources/students.db")) {
					sb.append("<li>");
					final StringBuilder append = sb.append("<a href='/diploma/").append(stu.getId()).append("'>").append(stu.getTitle()).append(' ').append(stu.getName()).append("</a>");
					sb.append("</li>");
				}

				sb.append("</ul></body></html>");
				response.setContentType("text/html; charset=utf-8");
				response.setContentLength(sb.length());
				response.getWriter().write(sb.toString());
			}
		}, path);
	}
}
