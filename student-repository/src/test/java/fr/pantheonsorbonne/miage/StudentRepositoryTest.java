package fr.pantheonsorbonne.miage;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Iterables;

class StudentRepositoryTest {
	
	Student student;
	@BeforeEach
	void beforeEach() {
		student = new Student(1,"Hayoun","Mr","azertyuiop");
	}
	
	@Test
	void testToReccord() {
		
		List<String>testList = StudentRepository.toReccord(student);
		assertEquals("Hayoun", testList.get(0));
		assertEquals("Mr", testList.get(1));
		assertEquals("1", testList.get(2));
		assertEquals("azertyuiop", testList.get(3));

	
	}

	@Test
	void testIterator() {
		StudentRepository db = StudentRepository.withDB("test");
		db.add(student);
		Student nathan = Iterables.get(db, 0);
		assertEquals("Hayoun", nathan.getName());
		assertEquals("Mr", nathan.getTitle());
		assertEquals(1, nathan.getId());
		assertEquals("azertyuiop", nathan.getPassword());


	}

}
