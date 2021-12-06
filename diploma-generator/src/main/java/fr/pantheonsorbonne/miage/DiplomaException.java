package fr.pantheonsorbonne.miage;

public class DiplomaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DiplomaException(String s, Exception e) {
		super(s, e);
	}
}
