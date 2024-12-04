package fr.pantheonsorbonne.miage;

public class UpdateFileException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateFileException(String s, Exception e) {
		super(s, e);
	}

}