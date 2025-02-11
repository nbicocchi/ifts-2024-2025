package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public class Square extends AbstractShape {
    double edge;

    public Square(double x, double y, Color color, double edge) {
        super(x, y, color);
        this.edge = edge;
    }

    @Override
    public double getPerimeter() {
        return edge * 4;
    }
}
