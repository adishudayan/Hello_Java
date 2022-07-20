package com.company;

public class AgeOverException extends Exception{
    public AgeOverException(String output){
        super(output);
    }
    public AgeOverException(Throwable reason){
        super(reason);
    }
}
