package com.globant.examples.java8;

import java.lang.annotation.Repeatable;

    @Repeatable(Colors.class)
    @interface Color {
        String name();
    }
    @interface Colors {
        Color[] value();
    }



