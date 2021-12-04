package fr.pantheonsorbonne.miage;

public class WriteDiplomaException extends Exception {

	public WriteDiplomaException(Exception e) {
		super("failed to write diploma file",e);
	}
	
}
