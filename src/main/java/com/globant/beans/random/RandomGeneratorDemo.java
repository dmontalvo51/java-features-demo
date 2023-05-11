package com.globant.beans.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Diego Montalvo
 */
@Slf4j
public class RandomGeneratorDemo {

    public static void main(String[] args) {

        RandomGenerator rdnGenerator = RandomGeneratorFactory
                                               .getDefault()
                                               .create();


        log.info("default random {}", rdnGenerator.nextInt(100));

        String rnNumbers = Stream.generate(() -> rdnGenerator.nextInt(100))
                                   .limit(100)
                                   .map(i -> i.toString())
                                   .collect(Collectors.joining(","));
        log.info("100 random numbers : {}", rnNumbers);

        String algs = RandomGeneratorFactory
                              .all()
                              .map(factory -> factory.group() + ":" + factory.name())
                              .collect(Collectors.joining("\n", "Random Algorithms", ""));
        log.info(algs);


    }
}
