package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class GenerateFileException extends RuntimeException {

	public GenerateFileException(String string, IOException e) {
		super(string,e);
	}

}
