package fr.pantheonsorbonne.miage;

public class FailedWriteException extends Exception {
	public FailedWriteException(String message, Exception e) {
		super(message,e);
	}
}
