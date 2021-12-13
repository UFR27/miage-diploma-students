package fr.pantheonsorbonne.miage;

public class Generror extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Generror(String error, Exception e) {
		super(error, e);
	}
}
