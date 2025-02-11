package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;

public abstract class AbstractShape implements Shape {
    double x;
    double y;
    Color color;

    public AbstractShape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract double getPerimeter();
}
