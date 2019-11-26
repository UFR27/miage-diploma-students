package fr.pantheonsorbonne.miage;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288




<<<<<<< HEAD
import java.util.Arrays;
import java.util.Collection;

import java.util.Date;








=======
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;


>>>>>>> webapp
=======
import java.util.Arrays;
import java.util.Collection;

import java.util.Date;








>>>>>>> 0840c9fd57eedb1f9867fc2beb8740d8ad33d288

import fr.pantheonsorbonne.miage.diploma.NameSnippet;
import fr.pantheonsorbonne.miage.diploma.DateSnippet;
import fr.pantheonsorbonne.miage.diploma.DiplomaSnippet;

public class MiageDiplomaGenerator extends AbstractDiplomaGenerator {

	private Student student;
	private Date date = null;

	/**
	 * Create the generator using a student name
	 * 
	 * @param name
	 */
	public MiageDiplomaGenerator(Student student) {
		this(student, new Date());
	}

	public MiageDiplomaGenerator(Student student, Date date) {
		this.student = student;
		this.date = date;
	}

	@Override
	protected Collection<DiplomaSnippet> getDiplomaSnippets() {
		String studentName = this.student.getName() + " " + this.student.getTitle();
		return Arrays.asList(new DateSnippet(this.date), new NameSnippet(studentName));
	}

}
