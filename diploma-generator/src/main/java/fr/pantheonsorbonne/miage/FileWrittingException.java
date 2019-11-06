package fr.pantheonsorbonne.miage;

public class FileWrittingException extends Exception {

	public FileWrittingException() {
	}

	public FileWrittingException(String message) {
		super(message);
	}

	public FileWrittingException(Throwable cause) {
		super(cause);
	}

	public FileWrittingException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileWrittingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
