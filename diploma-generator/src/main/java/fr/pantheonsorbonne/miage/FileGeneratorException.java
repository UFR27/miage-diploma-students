package fr.pantheonsorbonne.miage;

public class FileGeneratorException extends Exception {

	public FileGeneratorException(Exception e) {
		super("failed to generate the file to stream to",e);
	}
}
