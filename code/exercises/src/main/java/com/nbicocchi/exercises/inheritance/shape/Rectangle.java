package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    double e1, e2;

    public Rectangle(double x, double y, Color color, double e1, double e2) {
        super(x, y, color);
        this.e1 = e1;
        this.e2 = e2;
    }

    public double getPerimeter() {
        return 2 * (e1 + e2);
    }
}
