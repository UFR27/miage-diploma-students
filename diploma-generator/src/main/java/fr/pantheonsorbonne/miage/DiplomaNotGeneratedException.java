package fr.pantheonsorbonne.miage;

public class DiplomaNotGeneratedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6711967004221852170L;

	public DiplomaNotGeneratedException(String message, Exception e) {
		super(message, e);
	}
}