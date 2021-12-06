package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class DiplomaGenerationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DiplomaGenerationException(String string, IOException e) {
		super(string,e);
	}

}
