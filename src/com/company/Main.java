package com.company;

public class Main {

    public static void main(String[] args) throws AgeLessThanZeroException, AgeOverException {
	System.out.println("Hello Java");
    validateAge(103);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException, AgeOverException {
        if(age<0){
        throw new AgeLessThanZeroException(new RuntimeException("Invalid age"));
        }
        else
            System.out.println("Valid age");
        if(age>100){
            throw new AgeOverException(new Exception("Over age"));
        }

    }
}
