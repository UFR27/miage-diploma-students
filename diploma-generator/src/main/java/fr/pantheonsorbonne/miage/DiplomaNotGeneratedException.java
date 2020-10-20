package fr.pantheonsorbonne.miage;

public class DiplomaNotGeneratedException extends Exception {

	private static final long serialVersionUID = -6711967004221852170L;
	private static Throwable e;

	public DiplomaNotGeneratedException(String message) {
		super(message, e);
	}
	
}
