package fr.pantheonsorbonne.miage.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;

import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import fr.pantheonsorbonne.miage.StudentRepository;

class RootHandlerTest {

	@Test
	void doitEcrireLaListeDesEtudiantsDansLaSortieHTTP() throws Exception {
		// Given:
		// Une base contenant un etudiant
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.close();
		StudentRepository studentRepository = StudentRepository.withDB(tempDB.toString());

		Request mockRequest = Mockito.mock(Request.class);

		Response mockResponse = Mockito.mock(Response.class);
		Writer sortieHTTP = Mockito.mock(Writer.class);
		Mockito.when(mockResponse.getWriter()).thenReturn(sortieHTTP);

		RootHandler handlerToTest = new RootHandler(studentRepository);

		// When:
		handlerToTest.service(mockRequest, mockResponse);

		// Then:
		StringBuilder expectedContent = new StringBuilder()
				.append("<!DOCTYPE html><head><meta charset='utf-8'></head><body><h1>Liste des diplômés</h1><ul>")
				.append("<li><a href='/diploma/1'>Dr. Nicolas</a></li></ul></body></html>");

		Mockito.verify(mockResponse).setContentType("text/html; charset=utf-8");
		Mockito.verify(mockResponse).setContentLength(expectedContent.length());
		Mockito.verify(sortieHTTP).write(expectedContent.toString());

	}

}
