package com.company;

public class AgeLessThanZeroException extends Exception{
public AgeLessThanZeroException(String message){
    super(message);
}

public AgeLessThanZeroException(){}

public AgeLessThanZeroException(Throwable cause){
    super(cause);
}
}
