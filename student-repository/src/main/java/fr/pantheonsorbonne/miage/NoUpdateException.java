package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class NoUpdateException extends RuntimeException {

	public NoUpdateException(String string, IOException e) {
		super(string, e);
	}

	
}
