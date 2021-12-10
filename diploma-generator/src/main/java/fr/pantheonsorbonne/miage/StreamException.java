package fr.pantheonsorbonne.miage;

public class StreamException extends Exception {
	private static final long serialVersionUID = 1L;

	public StreamException(String s, Exception e) {
		super(s, e);
	}
}
