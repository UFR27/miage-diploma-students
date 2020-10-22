package fr.pantheonsorbonne.miage;
public class FailedToGenerateException extends Exception {
	public FailedToGenerateException() {
		super("failed to generate Document");
	}
}