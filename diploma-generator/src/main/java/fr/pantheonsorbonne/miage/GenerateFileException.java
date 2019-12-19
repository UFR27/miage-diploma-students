package fr.pantheonsorbonne.miage;

public class GenerateFileException extends Exception {

	public GenerateFileException(String message) {
		super(message);
		System.out.println(message);
	}

}
