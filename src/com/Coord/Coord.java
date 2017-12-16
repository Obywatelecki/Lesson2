package com.Coord;

public class Coord {

    protected double x;
    protected double y;

    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double diameter() {
        return Math.sqrt(x + y);
    }

    public double sum() {
        return x + y;
    }
}
