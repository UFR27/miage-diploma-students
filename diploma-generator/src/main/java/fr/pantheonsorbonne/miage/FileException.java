package fr.pantheonsorbonne.miage;

public class FileException extends Exception{
	public FileException(String str, Exception e) {
		super(str,e);
	}
}
