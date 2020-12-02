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
		fw.write("1,Nicolas,Dr.,nico\n");
        fw.write("2,Francois,M.,franco\n");
		fw.write("3,Mohamed,M.,momo\n");
		fw.write("4,Raphaël,M.,raf\n");
		fw.close();

		assertEquals(4, Iterables.size(StudentRepository.withDB(tempDB.toString())));

		Student nicolas = Iterables.get(StudentRepository.withDB(tempDB.toString()), 0);

		assertEquals("Nicolas", nicolas.getName());
		assertEquals("Dr.", nicolas.getTitle());
		assertEquals(1, nicolas.getId());
		assertEquals("nico", nicolas.getPassword());

		Student francois = Iterables.get(StudentRepository.withDB(tempDB.toString()), 1);

		assertEquals("Francois", francois.getName());
		assertEquals("M.", francois.getTitle());
		assertEquals(2, francois.getId());
		assertEquals("franco", francois.getPassword());
		
		StudentRepository.withDB(tempDB.toString()).add(new Student(3, "Mohamed", "M.", "momo"));
		
		assertEquals(3, Iterables.size(StudentRepository.withDB(tempDB.toString())));
		
		Student mohamed = Iterables.get(StudentRepository.withDB(tempDB.toString()), 2);
		
		Student raphael= Iterables.get(StudentRepository.withDB(tempDB.toString()), 3);

		assertEquals("Mohamed", mohamed.getName());
		assertEquals("M.", mohamed.getTitle());
		assertEquals(3, mohamed.getId());
		assertEquals("momo", mohamed.getPassword());
		
		assertEquals("Raphael", raphael.getName());
		assertEquals("M.", raphael.getTitle());
		assertEquals(4, raphael.getId());
		assertEquals("raph", raphael.getPassword());
		StudentRepository.withDB(tempDB.toString()).add(new Student(4, "Raphael", "M.", "raf"));
		
	}
}
