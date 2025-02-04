package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public class Circle extends Shape{
    double radius;

    public Circle(Color color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * radius * Math.PI;
    }
}
