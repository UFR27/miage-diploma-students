package fr.pantheonsorbonne.miage;

public class GeneratorDocRuntimeException extends RuntimeException { 
    public GeneratorDocRuntimeException () {
        super("Failed to generate Document");
    }
}
