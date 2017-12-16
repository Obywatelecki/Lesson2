package com.mypackage;

public class Coord {

    protected int x;
    protected int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        return x + y;
    }
}
