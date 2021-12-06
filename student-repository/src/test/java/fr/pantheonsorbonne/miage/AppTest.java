package fr.pantheonsorbonne.miage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.jupiter.api.Assertions;
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
	 * @throws AddStudentException 
	 */
	@Test
	public void shouldAnswerWithTrue() throws IOException, AddStudentException {
		File tempDB = Files.createTempFile("prefix", ".csv").toFile();
		FileWriter fw = new FileWriter(tempDB);
		fw.write("Nicolas,Dr.,1,nico\n");
		fw.write("Francois,M.,2,franco\n");
		fw.close();

		assertEquals(2, Iterables.size(StudentRepository.withDB(tempDB.toString())));

		Student nicolas = Iterables.get(StudentRepository.withDB(tempDB.toString()), 0);

		assertEquals("Nicolas", nicolas.getName());
		assertEquals("Dr.", nicolas.getTitle());
		assertEquals(1, nicolas.getId());
		assertEquals("nico", nicolas.getPassword());
		nicolas.setName("Advice");
		assertEquals("Advice", nicolas.getName());

		Student francois = Iterables.get(StudentRepository.withDB(tempDB.toString()), 1);

		assertEquals("Francois", francois.getName());
		assertEquals("M.", francois.getTitle());
		assertEquals(2, francois.getId());
		assertEquals("franco", francois.getPassword());
		assertEquals("M. Francois",francois.toString());
		francois.setTitle("Dr.");
		assertEquals("Dr.", francois.getTitle());
		
		StudentRepository.withDB(tempDB.toString()).add(new Student(3, "Mohamed", "M.", "momo"));
		
		assertEquals(3, Iterables.size(StudentRepository.withDB(tempDB.toString())));
		
		Student mohamed = Iterables.get(StudentRepository.withDB(tempDB.toString()), 2);

		assertEquals("Mohamed", mohamed.getName());
		assertEquals("M.", mohamed.getTitle());
		assertEquals(3, mohamed.getId());
		assertEquals("momo", mohamed.getPassword());
		mohamed.setTitle("he");
		
		File unwritableFile = Files.createTempFile("prefix", ".csv").toFile();
		unwritableFile.setReadOnly();
		
		Assertions.assertThrows(AddStudentException.class, ()-> 
		{StudentRepository.withDB(unwritableFile.toString()).add(new Student(3, "middle", "Mme.", "waves"));}
		);

		
	}
}
