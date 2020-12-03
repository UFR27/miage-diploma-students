package fr.pantheonsorbonne.miage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class studentRepositoryTests {

	private File temporaryDB;
	Student stu = new Student(1, "Nicolas", "Dr.", "123");

	@BeforeEach
	void setUp() throws Exception {
		Student stu = new Student(1, "Nicolas", "Dr.", "123");
		temporaryDB = Files.createTempFile("prefix", ".csv").toFile();

		FileWriter fw = new FileWriter(temporaryDB);
		fw.write("1,Nicolas,Dr.,123\n");
		fw.write("1,Francois,M.,456\n");
		fw.close();
	}

	@Test
	void testToRecord() {
		List<String> record = StudentRepository.toReccord(stu);

		assertEquals("" + stu.getId(), record.get(0));
		assertEquals(stu.getName(), record.get(1));
		assertEquals(stu.getTitle(), record.get(2));
		assertEquals(stu.getPassword(), record.get(3));
	}

	@Test
	void testAdd() {
		Student stu = new Student(1, "Nicolas", "Dr.", "123");
		StudentRepository repo = StudentRepository.withDB(this.temporaryDB.toString());
		repo.add(stu);

		boolean found = false;

		for (Student candidate : repo) {
			if (candidate.equals(stu)) {
				found = true;
			}
		}

		assertTrue(found, "the student is not in the repo");
	}

}
