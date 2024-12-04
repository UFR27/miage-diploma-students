package fr.pantheonsorbonne.miage;

public class FailedFileStreamException extends Exception {
	
	public FailedFileStreamException(String message, Exception e) {
		super(message,e);
	}

}
