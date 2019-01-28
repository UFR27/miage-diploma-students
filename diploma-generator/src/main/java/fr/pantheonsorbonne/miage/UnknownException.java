package fr.pantheonsorbonne.miage;

public class UnknownException extends Exception
{

    public UnknownException(){} //Constructeur sans param


    public UnknownException(String msg) //Constructeur qui affiche un message
    {
        super(msg);
    }

    public UnknownException(String msg, Exception e)
    {
        super(msg,e);
    }
}
