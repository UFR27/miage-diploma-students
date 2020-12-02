package fr.pantheonsorbonne.miage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.google.common.collect.Iterables;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 * 
	 * @throws IOException
	 */
	@Test
	public void shouldAnswerWithTrue() throws IOException {
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,123\n");
		fw.write("Francois,M.,2,123\n");
		fw.close();
		
		

		assertEquals(2, Iterables.size(StudentRepository.withDB(tempDB.toString())));

		Student nicolas = Iterables.get(StudentRepository.withDB(tempDB.toString()), 0);

		assertEquals("Nicolas", nicolas.getName());
		nicolas.setName("Nick");
		assertEquals("Nick", nicolas.getName());
		assertEquals("Dr.", nicolas.getTitle());
		nicolas.setTitle("Docteur");
		assertEquals("Docteur", nicolas.getTitle());
		assertEquals("Docteur Nick", nicolas.toString());
		assertEquals("123", nicolas.getPwd());
		nicolas.setPwd("321");
		assertEquals("321", nicolas.getPwd());
		assertEquals(1, nicolas.getId());
		assertEquals(Arrays.asList(nicolas.getName(), nicolas.getTitle(), "" + nicolas.getId()), StudentRepository.toReccord(nicolas));

		Student francois = Iterables.get(StudentRepository.withDB(tempDB.toString()), 1);

		assertEquals("Francois", francois.getName());
		assertEquals("M.", francois.getTitle());
		assertEquals(2, francois.getId());

		StudentRepository.add(nicolas);

	}
}
