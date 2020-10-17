package fr.pantheonsorbonne.miage;

public class FailedException extends RuntimeException {

	public FailedException(String string, Exception e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
