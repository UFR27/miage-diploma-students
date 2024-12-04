package fr.pantheonsorbonne.miage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStudent {

	
	Student student;
	@BeforeEach
	void beforeEach() {
		student = new Student(1,"Hayoun","Mr","azertyuiop");
	}
	@Test
	void testGetName() {
		assertEquals("Hayoun", student.getName());
	}

	@Test
	void testGetTitle() {
		assertEquals("Mr", student.getTitle());
	}

	@Test
	void testGetId() {
		assertEquals(1, student.getId());
	}

	@Test
	void testGetPassword() {
		assertEquals("azertyuiop", student.getPassword());
	}

}
