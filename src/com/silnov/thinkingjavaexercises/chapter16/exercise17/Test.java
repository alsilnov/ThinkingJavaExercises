package com.silnov.thinkingjavaexercises.chapter16.exercise17;
import java.util.Arrays;

interface Generator<T> {
    T next();

}

public class Test {

    static class BigDecimal implements Generator<java.math.BigDecimal> {
        private java.math.BigDecimal value;

        BigDecimal(java.math.BigDecimal n) {
            value = n;
        }

        @Override
        public java.math.BigDecimal next() {
            value = value.add(new java.math.BigDecimal(1));
            return value;
        }

    }

    public static void showBigDecimalArray(int len) {
        BigDecimal bdg = new BigDecimal(new java.math.BigDecimal("11111111111111111111111111111111111111111111111111111111111111111111"));
        java.math.BigDecimal[] bda = new java.math.BigDecimal[len];
        for (int i = 0; i < len; i++) {
            bda[i] = bdg.next();
        }
        System.out.println(Arrays.toString(bda));
    }

    public static void main(String[] args) {
        showBigDecimalArray(10);
    }
}