package fr.pantheonsorbonne.miage;

public class OtherException extends Exception
{
    public OtherException(){} //Constructeur sans param


    public OtherException(String msg) //Constructeur qui affiche un message
    {
        super(msg);
    }

    public OtherException(String msg, Exception e)
    {
        super(msg,e);
    }
}
