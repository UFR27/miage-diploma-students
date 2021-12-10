package fr.pantheonsorbonne.miage;

public class GeneratorRuntimeException extends RuntimeException { 
    public GeneratorRuntimeException () {
        super("Failed to generate the file to stream to");
    }
}
