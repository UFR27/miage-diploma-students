package fr.pantheonsorbonne.miage;

public class MyOwnRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8639664008251135765L;

	public MyOwnRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
