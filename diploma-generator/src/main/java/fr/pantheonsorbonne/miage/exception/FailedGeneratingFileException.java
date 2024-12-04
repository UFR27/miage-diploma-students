package fr.pantheonsorbonne.miage.exception;

public class FailedGeneratingFileException extends RuntimeException {
    public FailedGeneratingFileException(String msg,Exception e){
        super(msg,e);
    }

    
}
