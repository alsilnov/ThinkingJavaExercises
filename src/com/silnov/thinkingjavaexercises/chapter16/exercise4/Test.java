package com.silnov.thinkingjavaexercises.chapter16.exercise4;

import java.util.Arrays;
import java.util.Random;

public class Test {
    static Double[][][] foo(int n, int m, int p) {
        Random rand = new Random();
        Double[][][] dArray = new Double[n][m][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    dArray[i][j][k] = n + (p - n) * rand.nextDouble();
                }
            }
        }
        return dArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(foo(5, 10, 15)));
    }
}
