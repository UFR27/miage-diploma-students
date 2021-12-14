package fr.pantheonsorbonne.miage;

public class Exp extends Exception {

 	/**
 	 * 
 	 */
 	private static final long serialVersionUID = 1L;

 	public Exp(String error, Exception e) {
 		super(error, e);
}
}