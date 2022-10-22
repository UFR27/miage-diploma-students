package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class WriteDiplomaFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WriteDiplomaFileException(String string, IOException e) {
		super(string, e);
	}

}
