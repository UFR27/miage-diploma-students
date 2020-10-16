package fr.pantheonsorbonne.miage;


public class FailedGenerateException extends Exception {
	public FailedGenerateException(String message, Exception e) {
		super(message,e);
	}
	
}
