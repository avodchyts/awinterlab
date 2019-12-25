package com.company;

public class MyException extends Exception {
    String message;

    public  MyException(){}
    public  MyException (String message){ System.out.println(message);
    }
}
