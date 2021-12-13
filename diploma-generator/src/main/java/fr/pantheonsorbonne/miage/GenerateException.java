package fr.pantheonsorbonne.miage;

public class GenerateException extends Exception {

	private static final long serialVersionUID = 1L;

	public GenerateException(String error, Exception e) {
		super(error, e);
	}
}