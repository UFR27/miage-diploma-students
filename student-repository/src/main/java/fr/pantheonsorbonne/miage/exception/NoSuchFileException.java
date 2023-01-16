package fr.pantheonsorbonne.miage.exception;

public class NoSuchFileException extends RuntimeException {
    public NoSuchFileException(String msg){
        super(msg);
    }
}
