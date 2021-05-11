package com.silnov.thinkingjavaexercises.chapter16.exercise1;

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Test {
    static void foo(BerylliumSphere[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        foo(new BerylliumSphere[] { new BerylliumSphere() });
    }
}
