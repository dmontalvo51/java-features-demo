package com.globant.examples.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsImprovements {


    public static void main(String[] args) {

        List<String> alphabets = List.of("a", "b", "c", "d",
                "e", "f", "g", "h", "i");

        List<String> subset1 = alphabets
                .stream()
                .takeWhile(s -> !s.equals("d"))
                .collect(Collectors.toList());
        System.out.println(subset1);


        Stream<String> stream = Stream.ofNullable(null);
        System.out.println(stream.count()); //0


    }
}
