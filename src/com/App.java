package com;

import com.Coord.Coord;
import com.Coord.Coord3;

public class App {

    public static void increment(int[] x, int idx) {
        x[idx]++;
    }

    public static void main(String[] args) {

        Coord c1 = new Coord(1, 2);
        Coord c3 = new Coord();
        Coord c4 = new Coord(c1);
        Coord3 c2 = new Coord3(23, 42, 44);

        System.out.println("Diameter: " + c1.diameter() + "\n");
        System.out.println("Sum c1: " + c1.sum() + "\n");
        System.out.println("Sum c2: " + c2.sum() + "\n");

        Coord.greet();

        c1.setX(10);
        c2.setY(20);

        System.out.println("Sum c1: " + c1.sum());

        int[] x = {3, 6, 5};
        System.out.println(x[0]);
        increment(x, 0);
        System.out.println(x[0]);

        System.out.println(c1.multisum(5));
        Coord3.mean(1, 10);


    }
}

