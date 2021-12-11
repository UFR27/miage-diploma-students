package fr.pantheonsorbonne.miage;

public class GenerateFail extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GenerateFail(String errorMessage, Exception e) {
		super(errorMessage, e);
	}
}