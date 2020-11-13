package fr.pantheonsorbonne.miage;

public class FailedUpdateDBException extends RuntimeException {
	public FailedUpdateDBException(String s, Exception e) {
		super(s, e);
	}

}
