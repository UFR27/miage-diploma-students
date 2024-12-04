package fr.pantheonsorbonne.miage.exception;

public class FailedWritingDiplomaException extends RuntimeException{
    public FailedWritingDiplomaException(String msg,Exception e){
        super(msg,e);
    }

}