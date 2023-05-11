package com.globant.beans.switchs;

import java.util.Objects;

/**
 * @author Diego Montalvo
 */

public class CircleC implements Shape {
    private final double radius;

    public CircleC(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CircleC circleC)) return false;
        return Double.compare(circleC.getRadius(), radius) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

}
