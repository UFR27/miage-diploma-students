package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class DiplomaFileAdapterException extends RuntimeException {

	public DiplomaFileAdapterException(String string, IOException e) {
		super(string, e);
	}

}
