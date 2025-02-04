package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public class Square extends Shape{
    double edge;

    public Square(Color color, double x, double y, double edge) {
        super(color, x, y);
        this.edge = edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }
}
