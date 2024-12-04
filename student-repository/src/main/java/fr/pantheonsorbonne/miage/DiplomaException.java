package fr.pantheonsorbonne.miage;

public class DiplomaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DiplomaException(String string) {
		super (string);
	}

	public DiplomaException(String string, Exception e) {
		super(string,e);
	}
	
}
