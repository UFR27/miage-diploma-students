package fr.pantheonsorbonne.miage;

public class FileException extends RuntimeException{
    public FileException(String msg,Exception e){
        super(msg,e);
    }
}
