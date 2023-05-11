package com.globant.beans.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList16 {

    public static void main(String[] args) {


        List<String> ids = Arrays.asList("123", "456", "678");

        //Before J16
        List<Integer> intIds = ids.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //After J16
        List<Integer> intIds16 = ids.stream()
                .map(Integer::parseInt)
                .toList();

        var testList = ids.stream()
                .map(InternalError::new)
                .toList();


    }
}
