package fr.pantheonsorbonne.miage;

public class TestDateException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestDateException(String string, Exception e) {
		super(string, e);
	}
}
