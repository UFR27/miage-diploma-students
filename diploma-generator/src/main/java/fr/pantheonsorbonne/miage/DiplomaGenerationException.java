package fr.pantheonsorbonne.miage;

<<<<<<< HEAD
public class DiplomaGenerationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DiplomaGenerationException(String string, Exception e) {
		super(string, e);
	}
=======
import java.io.IOException;

public class DiplomaGenerationException extends Exception {

	public DiplomaGenerationException(String string, IOException e) {
		super(string, e);
	}

>>>>>>> master
}
