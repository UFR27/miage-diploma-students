package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class FailedException extends RuntimeException {

	public FailedException(String string, IOException e) {
		super(string,e);
	}

	public FailedException(String string, Exception e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

}
