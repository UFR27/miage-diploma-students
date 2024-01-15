package fr.pantheonsorbonne.miage.handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

import com.google.common.io.ByteStreams;

import fr.pantheonsorbonne.miage.DiplomaGenerator;
import fr.pantheonsorbonne.miage.MiageDiplomaGenerator;
import fr.pantheonsorbonne.miage.Student;
import fr.pantheonsorbonne.miage.StudentRepository;

public class ResponseHandler extends HttpHandler {
	private final StudentRepository studentRepository;

	public ResponseHandler(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	private void handleResponse(Response response, int studentId) throws IOException {

		Student student = studentRepository.getStudentData(studentId);
		
		response.setContentType("application/pdf");


		DiplomaGenerator generator = new MiageDiplomaGenerator(student);
		try (InputStream is = generator.getContent()) {
			try (OutputStream os = response.createOutputStream()) {
				ByteStreams.copy(is, os);
			}
		}
	}

	@Override
	public void service(Request request, Response response) throws Exception {
		try {
			// get the id of the student
			int id = Integer.parseInt(request.getPathInfo().substring(1));
			handleResponse(response, id);
		} catch (NoSuchElementException ex) {
			handleNotFound(response);
		}
	}

	private void handleNotFound(Response response) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		response.setStatus(404);
		response.getWriter().write("Erreur 404 : Le diplome n'existe pas pour cet utilisateur");

	}

}
