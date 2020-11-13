package fr.pantheonsorbonne.miage;

import java.io.IOException;

public class GenerateFileException extends RuntimeException
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenerateFileException(String string, IOException e)
	{
		super(string, e);
	}

}
