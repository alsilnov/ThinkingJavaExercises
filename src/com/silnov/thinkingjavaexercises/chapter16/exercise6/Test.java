package com.silnov.thinkingjavaexercises.chapter16.exercise6;

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Test {
    static BerylliumSphere[][] foo(int n, int m) {
        BerylliumSphere[][] dArray = new BerylliumSphere[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dArray[i][j] = new BerylliumSphere();
            }
        }
        return dArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(foo(5, 10)));
    }
}
