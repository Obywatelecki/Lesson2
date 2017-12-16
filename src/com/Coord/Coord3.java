package com.Coord;

public class Coord3 extends Coord {

    protected double z;

    public Coord3(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double sum() { //sygnatura klasy: nazwa i typy argumentow
        return super.sum() + z;
    }
}
