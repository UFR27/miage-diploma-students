package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class GenerationFailedException extends Exception {

	public GenerationFailedException(String string, IOException e) {
	}

	public GenerationFailedException(String string, Exception e) {
	}

}
