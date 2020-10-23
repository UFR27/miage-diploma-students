package fr.pantheonsorbonne.miage;

public class FailedToGenerateException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FailedToGenerateException(String message, Exception e)
	{
		super(message,e);
	}
}
