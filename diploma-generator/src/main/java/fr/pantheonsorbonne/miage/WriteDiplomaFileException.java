package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class WriteDiplomaFileException extends Exception {

	public WriteDiplomaFileException(String string, IOException e) {
		super(string,e);
	}

}
