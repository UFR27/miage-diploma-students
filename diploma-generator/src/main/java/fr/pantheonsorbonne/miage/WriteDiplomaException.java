package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class WriteDiplomaException extends RuntimeException {

	public WriteDiplomaException(String string, IOException e) {
		super(string,e);
	}


}
