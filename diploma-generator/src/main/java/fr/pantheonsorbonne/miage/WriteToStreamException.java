package fr.pantheonsorbonne.miage;

public class WriteToStreamException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WriteToStreamException(String string, Exception e)
	{
		super(string, e);
	}
	
}
