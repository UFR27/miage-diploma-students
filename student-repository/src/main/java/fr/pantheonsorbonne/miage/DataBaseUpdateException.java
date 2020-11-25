package fr.pantheonsorbonne.miage;

public class DataBaseUpdateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5028729628134289031L;

	public DataBaseUpdateException() {
	}

	public DataBaseUpdateException(String message) {
		super(message);
	}

	public DataBaseUpdateException(Throwable cause) {
		super(cause);
	}

	public DataBaseUpdateException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataBaseUpdateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
