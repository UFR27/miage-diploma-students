package fr.pantheonsorbonne.miage;

import java.io.IOException;
import java.io.InputStream;
<<<<<<< HEAD
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

=======
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;

>>>>>>> webapp
import org.glassfish.grizzly.http.io.NIOOutputStream;
import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
<<<<<<< HEAD

import com.google.common.collect.Iterables;
=======
import org.glassfish.grizzly.http.util.ContentType;
import org.glassfish.grizzly.servlet.WebappContext;
import org.glassfish.jersey.grizzly2.servlet.GrizzlyWebContainerFactory;

import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
>>>>>>> webapp
import com.google.common.io.ByteStreams;

/**
 * Main class.
 *
 */
public class Main {
	public static final String HOST = "localhost";
	public static final int PORT = 7000;
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	private static StudentRepository studentRepo = StudentRepository.withDB("src/main/resources/students.db");
<<<<<<< HEAD
	private static String webAppURL = "http://localhost:8080/home";
=======
>>>>>>> webapp

	public static void main(String[] args) throws IOException, URISyntaxException {

		HttpServer server = HttpServer.createSimpleServer();
		addRootPath(server, "/home");
		addDiplomaPath(server, "/diploma/*");

		try

		{
			server.start();
<<<<<<< HEAD
			java.awt.Desktop.getDesktop().browse(new URI(webAppURL));
			logger.log(Level.FINE, "Press any key to stop the server...");
			System.in.read();
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.toString());
=======
			java.awt.Desktop.getDesktop().browse(new URI("http://localhost:8080/home"));
			System.out.println("Press any key to stop the server...");
			System.in.read();
		} catch (Exception e) {
			System.err.println(e);
>>>>>>> webapp
		}
	}

	protected static Student getStudentData(int studentId, StudentRepository repo) {
		// create an arrayList of the students, because iterables are too hard
		ArrayList<Student> students = new ArrayList<>();
		Iterables.addAll(students, repo);
<<<<<<< HEAD
		for (Student student : students) {
=======

		for (Student student:students) {
>>>>>>> webapp
			if (student.getId() == studentId) {
				return student;
			}
		}

		throw new NoSuchElementException();
<<<<<<< HEAD
	}

	protected static void handleResponse(Response response, int studentId) throws IOException {
		response.setContentType("application/pdf");
		Student student = getStudentData(studentId, studentRepo);
=======

	}

	protected static void handleResponse(Response response, int studentId) throws IOException {

		response.setContentType("application/pdf");

		Student student = getStudentData(studentId, studentRepo);

>>>>>>> webapp
		DiplomaGenerator generator = new MiageDiplomaGenerator(student);
		try (InputStream is = generator.getContent()) {
			try (NIOOutputStream os = response.createOutputStream()) {
				ByteStreams.copy(is, os);
			}

		}
<<<<<<< HEAD
=======
		return;
>>>>>>> webapp
	}

	protected static void addDiplomaPath(HttpServer server, String path) {
		server.getServerConfiguration().addHttpHandler(new HttpHandler() {
			public void service(Request request, Response response) throws Exception {
				// get the id of the student
				int id = Integer.parseInt(request.getPathInfo().substring(1));
<<<<<<< HEAD
=======

>>>>>>> webapp
				handleResponse(response, id);
				response.setContentType("text/html; charset=utf-8");
				response.setStatus(404);
				response.getWriter().write("Erreur 404 : Le diplome n'existe pas pour cet utilisateur");
<<<<<<< HEAD
=======

>>>>>>> webapp
			}
		}, path);
	}

	protected static void addRootPath(HttpServer server, String path) {
		server.getServerConfiguration().addHttpHandler(new HttpHandler() {
			public void service(Request request, Response response) throws Exception {

				StringBuilder sb = new StringBuilder();
				sb.append("<!DOCTYPE html><head><meta charset='utf-8'></head><body><h1>Liste des diplômés</h1><ul>");
				for (Student stu : StudentRepository.withDB("src/main/resources/students.db")) {
					sb.append("<li>");
<<<<<<< HEAD
					sb.append("<a href='/diploma/" + stu.getId() + "'>" + stu.getTitle() + ' ' + stu.getName() + "</a>");
=======
					sb.append(
							"<a href='/diploma/" + stu.getId() + "'>" + stu.getTitle() + ' ' + stu.getName() + "</a>");
>>>>>>> webapp
					sb.append("</li>");
				}

				sb.append("</ul></body></html>");
				response.setContentType("text/html; charset=utf-8");
				response.setContentLength(sb.length());
				response.getWriter().write(sb.toString());
			}
		}, path);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> webapp
