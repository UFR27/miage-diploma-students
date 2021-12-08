package fr.pantheonsorbonne.miage;

public class FileException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public FileException(String s, Exception e) {
		super(s, e);
	}
}