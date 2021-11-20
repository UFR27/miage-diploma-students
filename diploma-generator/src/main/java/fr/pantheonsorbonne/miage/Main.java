package fr.pantheonsorbonne.miage;

import com.google.common.collect.Iterables;

public class Main {

	public static void main(String[] args) {
		StudentRepository repository = StudentRepository.withDB("../student-repository/src/main/resources/students.db");
		for (Student student : repository) {
		
			MiageDiplomaGenerator generator = new MiageDiplomaGenerator(student);
			DiplomaFileAdapter adapter = new DiplomaFileAdapter(generator);
			adapter.generateFile("diploma_" + student.getName() + ".pdf");
			}	

	}

}
