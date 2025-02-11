package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public class Circle extends AbstractShape {
    double radius;

    public Circle(double x, double y, Color color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * radius * Math.PI;
    }
}
