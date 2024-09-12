package fr.pantheonsorbonne.miage;

public class FailedToWriteException extends Exception {
	public FailedToWriteException() {
		super("failed to write diploma file");
	}
}
