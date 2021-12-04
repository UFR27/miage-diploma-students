package fr.pantheonsorbonne.miage;



public class Main {

	public static void main(String[] args) {
		StudentRepository rep = StudentRepository.withDB("../student-repository/src/main/resources/students.db");
		for (Student student : rep) {
		
		MiageDiplomaGenerator generator = new MiageDiplomaGenerator(student);
		DiplomaFileAdapter adapter = new DiplomaFileAdapter(generator);
		adapter.generateFile("diploma_" + student.getName() + ".pdf");
		}
				
				

	}

}
