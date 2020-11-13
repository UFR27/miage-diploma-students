package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class GetContentException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GetContentException(String string, IOException e)
	{
		super(string, e);
	}

}
