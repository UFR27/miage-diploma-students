package fr.pantheonsorbonne.miage;



public class ExceptionMajBDD extends RuntimeException {

	public ExceptionMajBDD(String string) {
		super(string);
	}

	
	public ExceptionMajBDD(String string, Exception e) {
		super(string,e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
