package com.nbicocchi.exercises.classes;

public class MovingObject {
    double x,y,z;
    double cx,cy,cz;
    double vx,vy,vz;

    public MovingObject(double x, double y, double z, double vx, double vy, double vz) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.cx = x;
        this.cy = y;
        this.cz = z;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void update(double t) {
        cx = x + vx * t;
        cy = y + vy * t;
        cz = z + vz * t;
    }

    @Override
    public String toString() {
        return "MovingObject{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", cx=" + cx +
                ", cy=" + cy +
                ", cz=" + cz +
                ", vx=" + vx +
                ", vy=" + vy +
                ", vz=" + vz +
                '}';
    }

    public static void main(String[] args) {
        MovingObject mo1 = new MovingObject(0,0,0,0,3,0);
        for (int t = 0; t < 10; t++) {
            mo1.update(t);
            System.out.println(mo1);
        }

    }
}
