package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class DiplomaFileWrtitingFailException extends Exception {

	public DiplomaFileWrtitingFailException(String string, IOException e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
