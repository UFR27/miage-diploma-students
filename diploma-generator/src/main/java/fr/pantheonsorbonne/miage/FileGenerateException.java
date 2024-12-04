package fr.pantheonsorbonne.miage;

public class FileGenerateException extends RuntimeException{
    public FileGenerateException(String msg,Exception e){
        super(msg,e);
    }

}
