package fr.pantheonsorbonne.miage;

public class FailDiplomaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FailDiplomaException(String s, Exception e) {
		super(s, e);
	}

}