package fr.pantheonsorbonne.miage.exception;

public class FailedWritingDiploma extends RuntimeException{
    public FailedWritingDiploma(String msg,Exception e){
        super(msg,e);
    }

}