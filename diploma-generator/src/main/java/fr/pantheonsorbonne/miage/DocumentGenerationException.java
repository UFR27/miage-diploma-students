package fr.pantheonsorbonne.miage;

public class DocumentGenerationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DocumentGenerationException(String string, Exception e) {
		super(string,e);
	}

}