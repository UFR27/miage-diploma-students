package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class DiplomaGenerationException extends Exception {

	public DiplomaGenerationException(String string, IOException e) {
		super(string, e);
	}

}
