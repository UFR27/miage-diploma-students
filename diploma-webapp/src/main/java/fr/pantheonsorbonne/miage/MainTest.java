package fr.pantheonsorbonne.miage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	@Order(1)
	void testGetStudentData() {
		File f = new File("test.csv");
		System.out.println(f.exists());
		if (f.exists()) {
			f.delete();
		}
		
		try {
			f.createNewFile();
		} catch (Exception e) {

		}
		StudentRepository sr = StudentRepository.withDB("test.csv");
		Student said2 = new Student(998,"Said2","Etudiant");
		Student said = new Student(999,"Said","Etudiant");
		
		sr.add(said2);
		sr.add(said);
		try {
			Student s = Main.getStudentData(999,sr);
			assertEquals(said.getName(),s.getName());
			assertEquals(said.getId(),s.getId());
			assertEquals(said.getTitle(),s.getTitle());
		}
		finally {
			f.delete();
		}
		
		
	}

}
