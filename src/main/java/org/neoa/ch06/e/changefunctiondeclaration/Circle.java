package org.neoa.ch06.e.changefunctiondeclaration;

public class Circle {

    public double circum(double radius) {
        return circumference(radius);
    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
