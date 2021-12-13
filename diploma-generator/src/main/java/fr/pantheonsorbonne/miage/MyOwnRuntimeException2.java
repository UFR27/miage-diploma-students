package fr.pantheonsorbonne.miage;

public class MyOwnRuntimeException2 extends Exception{
	private static final long serialVersionUID = 1L;

 	public MyOwnRuntimeException2(String errorMessage, Exception e) {
         super(errorMessage, e);
     }

}
