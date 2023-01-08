package fr.pantheonsorbonne.miage;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.google.common.collect.Iterables;

public class Main {

	public static void main(String[] args) {
		Path studentDbPath = Paths.get("student-repository", "src", "main", "resources", "students.db");
		StudentRepository repo = StudentRepository.withDB(studentDbPath.toString());
		Student student = Iterables.get(repo, 0);
		
		MiageDiplomaGenerator generator = new MiageDiplomaGenerator(student);
		DiplomaFileAdapter adapter = new DiplomaFileAdapter(generator);
		adapter.generateFile("temp_diploma.pdf");
				
				

	}

}
