package fr.pantheonsorbonne.miage;

public class BdUpdateExeption extends RuntimeException {

    public BdUpdateExeption (String ms, Exception e){
        super(ms,e);
    }
}
