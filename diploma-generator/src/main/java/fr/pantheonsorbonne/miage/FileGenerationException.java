package fr.pantheonsorbonne.miage;

public class FileGenerationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileGenerationException(String string, Exception e) {
		super(string, e);
	}
}
