package fr.pantheonsorbonne.miage;


public class DiplomaGeneratorException extends RuntimeException {

	public DiplomaGeneratorException(String string) {
		super(string);
	}

	public DiplomaGeneratorException(String string, Exception e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
