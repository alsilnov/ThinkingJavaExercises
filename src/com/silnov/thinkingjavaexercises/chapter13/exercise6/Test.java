package com.silnov.thinkingjavaexercises.chapter13.exercise6;

import java.util.*;

/**
 * Test
 */
public class Test {
    int i;
    long l;
    float f;
    double d;

    Test(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("i = %d\nl = %d\nf = %.16g\nd = %.16g\n", i, l, f, d);
    }

    public static void main(String[] args) {
        Test x = new Test(2, 45l, 1.2f, 2.7182818289);
        Test ex = new Test(-2147483648, -9223372036854775808L, 1.1754943508222875E-38f, 2.2250738585072014E-308);
        Test exMax = new Test(2147483647, 9223372036854775807L, 3.4028234663852886E38f, 1.7976931348623157E308);
        System.out.println(x);
        System.out.println(ex);
        System.out.println(exMax);
    }

}