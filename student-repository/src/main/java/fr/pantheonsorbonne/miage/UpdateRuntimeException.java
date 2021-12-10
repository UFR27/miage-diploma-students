package fr.pantheonsorbonne.miage;

public class UpdateRuntimeException extends RuntimeException { 
    public UpdateRuntimeException () {
        super("Failed to update db file");
    }
}
