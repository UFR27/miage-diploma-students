package fr.pantheonsorbonne.miage;

public class DbMajException extends RuntimeException {

	    public DbMajException(String string) {
	        super(string);
	    }


	    public DbMajException(String string, Exception e) {
	        super(string,e);
	    }

	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;

	}
