package fr.pantheonsorbonne.miage;

public class FileException extends Exception {

	private static final long serialVersionUID = 65498615616L;
	
	public FileException(String string, Exception e) {
		super(string, e);
	}
}
