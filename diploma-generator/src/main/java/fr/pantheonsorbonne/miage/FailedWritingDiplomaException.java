package fr.pantheonsorbonne.miage;

public class FailedWritingDiplomaException extends Exception {
	private static final long serialVersionUID = 1L;

	FailedWritingDiplomaException(String message){
            super (message);
    }
}