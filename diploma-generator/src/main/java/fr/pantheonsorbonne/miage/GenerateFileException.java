package fr.pantheonsorbonne.miage;

public class GenerateFileException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public GenerateFileException(String desc, Exception e) {
		super(desc, e);
	}
}
