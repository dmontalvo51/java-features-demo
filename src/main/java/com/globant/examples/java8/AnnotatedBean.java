package com.globant.examples.java8;

import lombok.NonNull;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnnotatedBean {
    @Color(name = "red")
    @Color(name = "blue")
    @Color(name = "green")//Repeated
    String color;



    @NonNull String firstName = "Fulano";

    Map.@NonNull Entry<Integer, String> code =
            new AbstractMap.SimpleEntry<>(1, "ONE");

    List<@NonNull String> emails = new ArrayList<>();


}
