package fr.pantheonsorbonne.miage;

public class DiplomaFileException extends RuntimeException {
	
	public DiplomaFileException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
