package com;
import com.Coord.Coord;
import com.Coord.Coord3;

public class App {


    public static void main(String[] args) {

        Coord c1 = new Coord(1, 2);
        Coord3 c2 = new Coord3(23, 42, 44);

        System.out.println("Diameter: " + c1.diameter());
        System.out.println("Sum c1: " + c1.sum());
        System.out.println("Sum c2: " + c2.sum());
    }
}

