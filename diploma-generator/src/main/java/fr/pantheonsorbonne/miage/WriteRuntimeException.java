package fr.pantheonsorbonne.miage;

public class WriteRuntimeException extends RuntimeException { 
    public WriteRuntimeException () {
        super("Failed to write diploma file");
    }
}
