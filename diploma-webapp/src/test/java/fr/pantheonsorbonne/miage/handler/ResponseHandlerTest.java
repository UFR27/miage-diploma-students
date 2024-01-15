package fr.pantheonsorbonne.miage.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;

import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.mockito.Mockito;

import fr.pantheonsorbonne.miage.StudentRepository;

class ResponseHandlerTest {

	@Test
	void doitRetournerUneErreur404QuandLIDDeLEtudiantNExistePasDansLeRepository() throws Exception {
		// Given:
		// Une base contenant un etudiant
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.close();
		StudentRepository studentRepository = StudentRepository.withDB(tempDB.toString());

		Request mockRequest = Mockito.mock(Request.class);
		Mockito.when(mockRequest.getPathInfo()).thenReturn("/2");

		Response mockResponse = Mockito.mock(Response.class);
		Writer sortieHTTP = Mockito.mock(Writer.class);
		Mockito.when(mockResponse.getWriter()).thenReturn(sortieHTTP);

		ResponseHandler handlerToTest = new ResponseHandler(studentRepository);

		// When:
		handlerToTest.service(mockRequest, mockResponse);

		// Then:
		String expectedContent = "Erreur 404 : Le diplome n'existe pas pour cet utilisateur";

		Mockito.verify(mockResponse).setContentType("text/html; charset=utf-8");
		Mockito.verify(mockResponse).setStatus(404);
		Mockito.verify(sortieHTTP).write(expectedContent);

	}

	@Test
	void doitRetournerDansLaSortieHTTPLeDiplomeDeLEtudiantAPartirDeSonId() throws Exception {
		// Given:
		// Une base contenant un etudiant
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.close();
		StudentRepository studentRepository = StudentRepository.withDB(tempDB.toString());

		Request mockRequest = Mockito.mock(Request.class);
		Mockito.when(mockRequest.getPathInfo()).thenReturn("/1");

		Response mockResponse = Mockito.mock(Response.class, Answers.RETURNS_DEEP_STUBS);

		ResponseHandler handlerToTest = new ResponseHandler(studentRepository);

		// When:
		handlerToTest.service(mockRequest, mockResponse);

		// Then:
		Mockito.verify(mockResponse).setContentType("application/pdf");

	}

}
