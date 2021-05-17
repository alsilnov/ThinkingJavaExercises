package com.silnov.thinkingjavaexercises.chapter16.exercise12;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        double[] da = new double[10];
        CountingGenerator.Double dGen = new CountingGenerator.Double();
        for (int i = 0; i < da.length; i++)
            da[i] = dGen.next();
        System.out.println(Arrays.toString(da));
    }
}