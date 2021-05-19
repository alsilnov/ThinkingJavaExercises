package com.silnov.thinkingjavaexercises.chapter16.exercise2;

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Test {
    static BerylliumSphere[] foo(int n) {
        BerylliumSphere[] a = new BerylliumSphere[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = new BerylliumSphere();
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(foo(5)));
    }
}
