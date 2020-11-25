package fr.pantheonsorbonne.miage;

public class DbMajException extends RuntimeException {


    public DbMajException(String str) {
        super(str);
    }


    public DbMajException(String str, Exception e) {
        super(str,e);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}