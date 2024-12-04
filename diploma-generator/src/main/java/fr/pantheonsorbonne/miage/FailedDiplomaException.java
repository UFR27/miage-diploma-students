package fr.pantheonsorbonne.miage;

public class FailedDiplomaException extends RuntimeException {
	
	public FailedDiplomaException(String s, Exception e) {
		super(s, e);
	}
}
