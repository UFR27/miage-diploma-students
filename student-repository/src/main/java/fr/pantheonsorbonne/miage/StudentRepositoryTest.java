package fr.pantheonsorbonne.miage;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class StudentRepositoryTest {

	@Test
	@Order(1)
	void toRecordtest() {
		
		Student said = new Student(999,"Etudiant","Said");
		List tempList =  StudentRepository.toReccord(said);
		assertEquals(said.getId(), Integer.parseInt((String) tempList.get(2)));
		assertEquals(said.getName(), (String) tempList.get(0).toString());
		assertEquals(said.getTitle(), tempList.get(1));
		
	}
	@Test
	@Order(2)
	void addStudentToReppositoryTest() {
		//empty DB
		File f = new File("test.csv");
		try {
			f.createNewFile();
		} catch (Exception e) {

		}
		StudentRepository sr = StudentRepository.withDB("test.csv");
		Student said = new Student(999,"Said","Etudiant");
		sr.add(said);
		
		for(Student s : sr) {
			assertEquals(said.getName(),s.getName());
			assertEquals(said.getId(),s.getId());
			assertEquals(said.getTitle(),s.getTitle()); 
		}
		f.delete();
	}
	
	@Test
	@Order(3)
	void iteratorReppositoryTest() {
		
		//empty DB
				File f = new File("test.csv");
				try {
					f.createNewFile();
				} catch (Exception e) {

				}
				StudentRepository sr = StudentRepository.withDB("test.csv");
				Student said = new Student(999,"Said","Etudiant");
				sr.add(said);
				Iterator<Student> itSr= sr.iterator();
				while(itSr.hasNext()) {
					Student s = itSr.next();
					assertEquals(said.getName(),s.getName());
					assertEquals(said.getId(),s.getId());
					assertEquals(said.getTitle(),s.getTitle());
				}
				
				f.delete();
	}
	
	

}
