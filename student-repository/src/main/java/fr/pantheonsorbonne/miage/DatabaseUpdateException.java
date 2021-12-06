package fr.pantheonsorbonne.miage;

public class DatabaseUpdateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseUpdateException(String s, Exception e) {
		super(s, e);
	}
}
