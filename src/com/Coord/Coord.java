package com.Coord;

public class Coord {

    protected double x;
    protected double y;
    protected final double statVal = 10.0; // cos jak const w c++

    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void greet() {
        System.out.println("Lubie zurek!");
    }

    public void setX(double x) {
        this.x = x;
    }

    public double diameter() {
        return Math.sqrt(x + y);
    }

    public double sum() {
        return x + y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double multisum(double multi) {
        double value = sum() * multi;
        return value;
    }
}
