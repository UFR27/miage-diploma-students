package fr.pantheonsorbonne.miage;

public class StreamFileException extends Exception {

    private static final long serialVersionUID = 1L;

    public StreamFileException(String s, Exception e) {
        super(s,e);
    }

}