package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class EncryptedFileException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EncryptedFileException(String string, Exception e) {
		super(string, e);
	}
}
