package fr.pantheonsorbonne.miage;

public class FileGenerationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2214446623916866997L;

	public FileGenerationException() {
		super();
	}

	public FileGenerationException(String string, Exception e) {
		super(string, e);
	}

}
