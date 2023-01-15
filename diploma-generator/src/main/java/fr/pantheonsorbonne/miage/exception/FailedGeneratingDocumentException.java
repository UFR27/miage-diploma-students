package fr.pantheonsorbonne.miage.exception;

public class FailedGeneratingDocumentException extends RuntimeException{
    public FailedGeneratingDocumentException(String msg,Exception e){
        super(msg,e);
    }
    
}