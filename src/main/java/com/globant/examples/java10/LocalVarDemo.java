package com.globant.examples.java10;

import java.util.List;
import java.util.random.RandomGeneratorFactory;

public class LocalVarDemo {

    String name="Java 9";
    public void testLocals() {
        var firstName = "Pint";
        var lastName = "Pong";
        var type = randomLong();

        System.out.printf("Type %s%n",type);

        List<String> lista = List.of(firstName, lastName);
        for (var n : lista) {
            System.out.println(n);
        }

    }

    /*
    public var randomInt(){return RandomGeneratorFactory.getDefault().create().nextInt();}
    */

    public long randomLong() {
        return RandomGeneratorFactory.getDefault().create().nextLong();
    }
}


