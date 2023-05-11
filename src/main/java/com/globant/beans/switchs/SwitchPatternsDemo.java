package com.globant.beans.switchs;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Diego Montalvo
 */
@Slf4j
public class SwitchPatternsDemo {

    public static double getPerimeter(Shape shape) {
        if (shape instanceof Circle c) {
            return 2 * Math.PI + c.radius();
        }
        else if (shape instanceof Rectangle r) {
            return 2 * (r.length() + r.width());
        }
        else {
            throw new IllegalArgumentException();
        }
    }


    public static double getPerimeterWithSwitch(Shape shape) {
        return switch (shape) {
            case Circle c -> 2 * Math.PI + c.radius();
            case Rectangle r -> 2 * (r.length() + r.width());
            case null -> 0.0;
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }


    public static void nullSupport(Object o) {
        switch (o) {
            case String s -> log.info(s);
            case Integer i -> log.info(Integer.toString(i));
            case null -> log.info("Unknown");
            default -> log.info("Default");
        }
    }


    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        Rectangle r = new Rectangle(10.0, 20.0);
        log.info("Circle perimeter {}", getPerimeter(circle));
        log.info("Rectangle perimeter {}", getPerimeter(r));

        log.info("Circle perimeter with switch {}", getPerimeterWithSwitch(circle));
        log.info("Rectangle perimeter with switch {}", getPerimeterWithSwitch(r));

        log.info("Switch supports null!");
        nullSupport("Test");
        nullSupport(null);
        nullSupport(100);
    }
}
