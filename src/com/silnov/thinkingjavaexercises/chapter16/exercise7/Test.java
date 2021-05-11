package com.silnov.thinkingjavaexercises.chapter16.exercise7;

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    dArray[i][j][k] = new BerylliumSphere();
                }
            }
        }
        return dArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(foo(5, 10, 15)));
    }
}
