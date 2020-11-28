package fr.pantheonsorbonne.miage;

public class AddException extends RuntimeException {

	public AddException() {

	}

	public AddException(String message) {
		super(message);

	}

	public AddException(Throwable cause) {
		super(cause);

	}

	public AddException(String message, Throwable cause) {
		super(message, cause);

	}

	public AddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
