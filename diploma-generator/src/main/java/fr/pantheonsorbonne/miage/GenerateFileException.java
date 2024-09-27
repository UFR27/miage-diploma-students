package fr.pantheonsorbonne.miage;

public class GenerateFileException extends RuntimeException {

	public GenerateFileException(String string, Exception e) {
		super(string, e);
	}

}
