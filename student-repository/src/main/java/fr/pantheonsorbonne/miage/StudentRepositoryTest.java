package fr.pantheonsorbonne.miage;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.NoSuchElementException;

import org.junit.Test;

class StudentRepositoryTest {

	@Test
	void doitTrouverUnEtudiantApartirDeSonId() throws IOException {

		// Given:
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.close();

		StudentRepository repositoryToTest = StudentRepository.withDB(tempDB.toString());// ...

		// When:
		Student student = repositoryToTest.getStudentData(1);

		// Then:
		assertEquals("Nicolas", student.getName());
		assertEquals("Dr.", student.getTitle());
		assertEquals(1, student.getId());
		assertEquals("nico", student.getPassword());

	}

	@Test()
	void doitLancerNoSuchElementExceptionQuandIdNexistePas() throws IOException {
		// Given:
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.close();

		StudentRepository repositoryToTest = StudentRepository.withDB(tempDB.toString());// ...


	}

	private void assertThrows(Class<NoSuchElementException> class1, Object object) {
		// TODO Auto-generated method stub
		
	}

}