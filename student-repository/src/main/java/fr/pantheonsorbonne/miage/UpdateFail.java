package fr.pantheonsorbonne.miage;

public class UpdateFail extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpdateFail(String errorMessage) {
        super(errorMessage);
    }

}
