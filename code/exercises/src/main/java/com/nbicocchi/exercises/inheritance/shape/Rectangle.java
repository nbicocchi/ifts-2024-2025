package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public class Rectangle extends Shape{
    double l1, l2;

    public Rectangle(Color color, double x, double y, double l1, double l2) {
        super(color, x, y);
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getPerimeter() {
        return 2 * (l1 + l2);
    }
}
