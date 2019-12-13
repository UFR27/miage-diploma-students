package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class FileGeneratorException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private final String message;
	private final Exception exception;

	public FileGeneratorException(String string, IOException e) {
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
