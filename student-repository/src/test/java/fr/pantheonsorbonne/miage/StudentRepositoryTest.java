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
		student = new Student(1,"Rubinsohn","Mr","qsdfghjklm");
	}
	
	@Test
	void testToReccord() {
		
		List<String>testList = StudentRepository.toReccord(student);
		assertEquals("Rubinsohn", testList.get(0));
		assertEquals("Mr", testList.get(1));
		assertEquals("1", testList.get(2));
		assertEquals("qsdfghjklm", testList.get(3));

	
	}

	@Test
	void testIterator() {
		StudentRepository db = StudentRepository.withDB("test");
		db.add(student);
		Student ilan = Iterables.get(db, 0);
		assertEquals("Rubinsohn", ilan.getName());
		assertEquals("Mr", ilan.getTitle());
		assertEquals(1, ilan.getId());
		assertEquals("qsdfghjklm", ilan.getPassword());


	}

}
