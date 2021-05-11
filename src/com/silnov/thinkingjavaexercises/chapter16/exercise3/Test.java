package com.silnov.thinkingjavaexercises.chapter16.exercise3;

import java.util.Arrays;
import java.util.Random;

public class Test {
    static Double[][] foo(int n, int m) {
        Random rand = new Random();
        Double[][] dArray = new Double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dArray[i][j] = n + (m - n) * rand.nextDouble();
            }
        }
        return dArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(foo(5, 10)));
    }
}
