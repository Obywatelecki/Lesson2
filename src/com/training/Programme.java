package com.training;

import com.Coord.Coord;
import com.mypackage.MyClass;

public class Programme {

    public static void inc(int x) {
        x++;
    }

    public static void inc1(Integer x) {
        x++;
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Integer x = 7;
        int y = 7;
        inc(x);
        inc1(y);

        String s = "Tomek";
        print(s);

        Coord c2 = new Coord(1, 3);

        System.out.println("x ma wartosc: " + x);
        System.out.println("y ma wartosc: " + y);

        MyClass obj = new MyClass(1, 2);
        System.out.println(obj.sum());

        Coord c1 = new Coord(1, 2);
        System.out.println(c1.sum());

    }
}

