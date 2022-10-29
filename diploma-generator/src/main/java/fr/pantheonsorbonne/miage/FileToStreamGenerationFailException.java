package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class FileToStreamGenerationFailException extends Exception {

	public FileToStreamGenerationFailException(String string, IOException e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
