package com.silnov.thinkingjavaexercises.chapter16.exercise5;

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Test {
    static BerylliumSphere[][][] foo(int n, int m, int p) {

        BerylliumSphere[][][] dArray = new BerylliumSphere[n][m][p];
        return dArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(foo(5, 10, 15)));
    }
}
