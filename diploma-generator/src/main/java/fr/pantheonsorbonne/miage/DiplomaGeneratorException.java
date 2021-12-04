package fr.pantheonsorbonne.miage;

public class DiplomaGeneratorException extends Exception {

	public DiplomaGeneratorException(Exception e) {
		super("failed to generate Document",e);
	}
}
