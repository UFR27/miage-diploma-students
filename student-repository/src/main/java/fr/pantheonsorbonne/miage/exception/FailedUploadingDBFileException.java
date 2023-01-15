package fr.pantheonsorbonne.miage.exception;

public class FailedUploadingDBFileException extends RuntimeException {
    public FailedUploadingDBFileException(String msg){
        super(msg);
    }
}