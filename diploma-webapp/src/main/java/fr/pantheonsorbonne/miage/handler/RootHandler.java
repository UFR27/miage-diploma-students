package fr.pantheonsorbonne.miage.handler;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

import fr.pantheonsorbonne.miage.Student;
import fr.pantheonsorbonne.miage.StudentRepository;

public class RootHandler extends HttpHandler {
	private final StudentRepository studentRepository;

	public RootHandler(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	@Override
	public void service(Request request, Response response) throws Exception {

		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html><head><meta charset='utf-8'></head><body><h1>Liste des diplômés</h1><ul>");
		for (Student stu : studentRepository) {
			sb.append("<li>");
			sb.append("<a href='/diploma/" + stu.getId() + "'>" + stu.getTitle() + ' ' + stu.getName() + "</a>");
			sb.append("</li>");
		}

		sb.append("</ul></body></html>");
		response.setContentType("text/html; charset=utf-8");
		response.setContentLength(sb.length());
		response.getWriter().write(sb.toString());
	}

}
