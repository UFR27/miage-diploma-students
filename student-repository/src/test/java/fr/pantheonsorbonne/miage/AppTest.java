package fr.pantheonsorbonne.miage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.jupiter.api.Test;

import com.google.common.collect.Iterables;

/**
 * Unit test for simple App.
 */
 class AppTest {
	/**
	 * Rigorous Test :-)
	 * 
	 * @throws IOException
	 * @throws FailedException 
	 */
	@Test
	 void shouldAnswerWithTrue() throws IOException, FailedException {
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.write("Francois,M.,2,franco\n");
		fw.close();

		try {
			assertEquals(2, Iterables.size(StudentRepository.withDB(tempDB.toString())));
		} catch (FailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Student nicolas = null;
		try {
			nicolas = Iterables.get(StudentRepository.withDB(tempDB.toString()), 0);
		} catch (FailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals("Nicolas", nicolas.getName());
		assertEquals("Dr.", nicolas.getTitle());
		assertEquals(1, nicolas.getId());
		assertEquals("nico", nicolas.getPassword());

		Student francois = null;
		try {
			francois = Iterables.get(StudentRepository.withDB(tempDB.toString()), 1);
		} catch (FailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals("Francois", francois.getName());
		assertEquals("M.", francois.getTitle());
		assertEquals(2, francois.getId());
		assertEquals("franco", francois.getPassword());

		StudentRepository.withDB(tempDB.toString()).add(new Student(3, "Mohamed", "M.", "momo"));

		assertEquals(3, Iterables.size(StudentRepository.withDB(tempDB.toString())));

		Student mohamed = Iterables.get(StudentRepository.withDB(tempDB.toString()), 2);

		assertEquals("Mohamed", mohamed.getName());
		assertEquals("M.", mohamed.getTitle());
		assertEquals(3, mohamed.getId());
		assertEquals("momo", mohamed.getPassword());
		


	}
}