package fr.pantheonsorbonne.miage;

public class FileException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;
	private final Exception exception;


	public FileException(String string, Exception e) {
		this.message = string;
		this.exception = e;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public Exception getException() {
		return exception;
	}
}
