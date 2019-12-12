package fr.pantheonsorbonne.miage;

public class WriteToStreamException extends Exception {

	public WriteToStreamException() {

	}

	public WriteToStreamException(String message) {
		super(message);

	}

	public WriteToStreamException(Throwable cause) {
		super(cause);

	}

	public WriteToStreamException(String message, Throwable cause) {
		super(message, cause);

	}

	public WriteToStreamException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
