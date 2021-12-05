package fr.pantheonsorbonne.miage;

import java.util.concurrent.ExecutionException;

import com.google.common.collect.Iterables;

public class Main {

	public static void main(String[] args) {
		StudentRepository repo = StudentRepository.withDB("../student-repository/src/main/resources/students.db");
		Student student = Iterables.get(repo, 0);
		
		MiageDiplomaGenerator generator = new MiageDiplomaGenerator(student);
		DiplomaFileAdapter adapter = new DiplomaFileAdapter(generator);
		try {
			adapter.generateFile("temp_diploma.pdf");
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
				
				

	}

}
