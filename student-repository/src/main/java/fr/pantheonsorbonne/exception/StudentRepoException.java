package fr.pantheonsorbonne.exception;

public class StudentRepoException extends RuntimeException{
    public StudentRepoException(){
        super();
    }

    @Override
    public String getMessage(){
        return "failed to update db file";
    }
}
