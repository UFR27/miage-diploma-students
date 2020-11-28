package fr.pantheonsorbonne.miage;

public class GenerateDocumentException extends RuntimeException {

	public GenerateDocumentException(String string, Exception e) {
		super(string,e);
	}

}
