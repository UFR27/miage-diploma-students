package fr.pantheonsorbonne.miage;

public class StudentRepositoryException extends RuntimeException {

	public StudentRepositoryException() {
	}

	public StudentRepositoryException(String message) {
		super(message);
	}

	public StudentRepositoryException(Throwable cause) {
		super(cause);
	}

	public StudentRepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentRepositoryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
