package fr.pantheonsorbonne.miage;

public class WritingDipFailException extends Exception {

	private static final long serialVersionUID = 1L;

	public WritingDipFailException(String s, Exception e) {
		super(s, e);
	}

}