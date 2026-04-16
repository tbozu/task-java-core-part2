package org.example;

public class StringException extends Exception{

    public StringException(String message){
        super("String:"+message);
    }
}
