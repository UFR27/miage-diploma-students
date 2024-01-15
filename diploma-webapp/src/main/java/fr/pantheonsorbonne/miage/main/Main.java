package fr.pantheonsorbonne.miage.main;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

import org.glassfish.grizzly.http.server.HttpServer;

import fr.pantheonsorbonne.miage.StudentRepository;
import fr.pantheonsorbonne.miage.handler.ResponseHandler;
import fr.pantheonsorbonne.miage.handler.RootHandler;

/**
 * Main class.
 *
 */
public class Main {
	public static final String HOST = "localhost";
	public static final int PORT = 7000;
	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) throws IOException, URISyntaxException {

		StudentRepository studentRepo = StudentRepository.withDB("src/main/resources/students.db");
		
		HttpServer server = HttpServer.createSimpleServer();
		server.getServerConfiguration().addHttpHandler(new RootHandler(studentRepo), "/home");
		server.getServerConfiguration().addHttpHandler(new ResponseHandler(studentRepo), "/diploma/*");

		server.start();
		java.awt.Desktop.getDesktop().browse(new URI("http://localhost:8080/home"));
		System.out.println("Press any key to stop the server...");
		System.in.read();
		System.exit(0);

	}

}
