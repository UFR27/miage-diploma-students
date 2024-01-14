package fr.pantheonsorbonne.miage;

public class FailedStreamException extends RuntimeException{
    
    FailedStreamException(String messageErreur, Throwable e){
        super(messageErreur, e);
    }
}
