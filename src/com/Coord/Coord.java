package com.Coord;

public class Coord {

    protected double x;
    protected double y;
    protected final double statVal = 10.0; // cos jak const w c++

    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Konstruktor dwuargumentowy");
    }

    public Coord() {
        this.x = 0.0;
        this.y = 10.0;
        System.out.println("Konstruktor bezargumentowy");
    }

    public Coord(Coord nCoord) {
        this(nCoord.getX(), nCoord.getY());
        System.out.println("Konstruktor kopiujacy #1");
    }

    public static void greet() {
        System.out.println("Lubie zurek!");
    }

    public void setX(double x) {
        this.x = x;
    }

    public static void mean(int... args) {
        int counter = 0;
        int sum = 0;
        for (int i : args) {
            sum += i;
            counter++;
        }
        System.out.println(sum / counter);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double diameter() {
        return Math.sqrt(x + y);
    }

    public double sum() {
        return x + y;
    }

    public double multisum(double multi) {
        double value = sum() * multi;
        return value;
    }

    public void setY(double y) {
        this.y = y;
    }
}
