package com.nbicocchi.exercises.inheritance.shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Shape {
    Color color;
    double x;
    double y;

    public Shape(Color color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public static void main(String[] args) {
        List<Shape> l = new ArrayList<>();
        l.add(new Circle(Color.BLACK, 0,0,3));
        l.add(new Rectangle(Color.BLACK, 0,0,10,20));
        l.add(new Square(Color.BLACK, 0,0, 15));

        for (Shape s : l) {
            System.out.println(s.getPerimeter());
        }

    }
}
