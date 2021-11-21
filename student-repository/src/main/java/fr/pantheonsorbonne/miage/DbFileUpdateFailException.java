package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class DbFileUpdateFailException extends  RuntimeException {

	public DbFileUpdateFailException(String string) {
		super(string);
	}

	public DbFileUpdateFailException(String string, IOException e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
