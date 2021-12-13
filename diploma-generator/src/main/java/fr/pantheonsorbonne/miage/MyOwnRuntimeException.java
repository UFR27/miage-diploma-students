package fr.pantheonsorbonne.miage;

public class MyOwnRuntimeException extends Exception {
	private static final long serialVersionUID = 1L;

 	public MyOwnRuntimeException(String errorMessage) {
         super(errorMessage);
 	}

}
