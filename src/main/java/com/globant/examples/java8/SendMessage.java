package com.globant.examples.java8;

@FunctionalInterface
public interface SendMessage<M, T extends Integer> {

    private void preparePrinter() {
        System.out.println("Preparing Printer....");
    }

    private String getInterfaceName() {
        return "SendMessage";
    }

    default void defaultMessage() {
        preparePrinter();
        System.out.println("Mensaje por defecto");
    }

    void message(M message, T delay);

}



