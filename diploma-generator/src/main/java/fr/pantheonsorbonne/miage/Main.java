package fr.pantheonsorbonne.miage;

import com.google.common.collect.Iterables;

public class Main {

	public static void main(String[] args) throws WriteFileException {
		StudentRepository repo = StudentRepository.withDB("src/main/resources/students.db");
		Student student = Iterables.get(repo, 0);
		

		EncryptedDiplomaGeneratorDecorator generator = new EncryptedDiplomaGeneratorDecorator(new MiageDiplomaGenerator(student), student.getPassword());
		DiplomaFileAdapter adapter = new DiplomaFileAdapter(generator);
		adapter.generateFile("temp_diploma.pdf");
				
				

	}

}
