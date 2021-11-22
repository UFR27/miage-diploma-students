package fr.pantheonsorbonne.miage;

public class UpdateException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateException(String s, Exception e) {
		super(s, e);
	}
	
}
