package fr.pantheonsorbonne.miage;

public class DiplomaFailed extends Exception {

	private static final long serialVersionUID = 6379810650528213371L;
	public DiplomaFailed(String message, Exception e) {
		super(message,e);
	}
}
