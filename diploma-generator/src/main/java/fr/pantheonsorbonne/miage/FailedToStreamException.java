package fr.pantheonsorbonne.miage;

public class FailedToStreamException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FailedToStreamException(String message, Exception e)
	{
		super(message,e);
	}

}