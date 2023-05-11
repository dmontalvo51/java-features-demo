package com.globant.examples.java8;

public class LambdasDemo {

    public static void main(String[] args) {
        SendMessage<String, Integer> messenger = (a, b) -> {
            System.out.printf("Sending '%s' in %s seconds%n", a, b);
        };


        messenger.defaultMessage();


        messenger.message("Prueba 1", 10);
        messenger.message("Prueba 2", 20);

    }
}
