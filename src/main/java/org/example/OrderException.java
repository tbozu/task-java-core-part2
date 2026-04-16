package org.example;

public class OrderException extends Exception{

    public OrderException(){
        super("Don't find the numbers of orders");
    }
}
