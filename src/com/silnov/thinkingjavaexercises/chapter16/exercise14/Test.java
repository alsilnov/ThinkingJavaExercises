package com.silnov.thinkingjavaexercises.chapter16.exercise14;

import java.util.Arrays;

public class Test {
    public static void showShortArray(int len) {
        CountingGenerator.Short sg = new CountingGenerator.Short();
        short[] sa = new short[len];
        for (int i = 0; i < len; i++) {
            sa[i] = sg.next();
        }
        System.out.println(Arrays.toString(sa));
    }

    public static void showBooleanArray(int len) {
        CountingGenerator.Boolean bg = new CountingGenerator.Boolean();
        boolean[] ba = new boolean[len];
        for (int i = 0; i < len; i++) {
            ba[i] = bg.next();
        }
        System.out.println(Arrays.toString(ba));
    }

    public static void showCharArray(int len) {
        CountingGenerator.Character cg = new CountingGenerator.Character();
        char[] ca = new char[len];
        for (int i = 0; i < len; i++) {
            ca[i] = cg.next();
        }
        System.out.println(Arrays.toString(ca));
    }

    public static void showByteArray(int len) {
        CountingGenerator.Byte bg = new CountingGenerator.Byte();
        byte[] ba = new byte[len];
        for (int i = 0; i < len; i++) {
            ba[i] = bg.next();
        }
        System.out.println(Arrays.toString(ba));
    }

    public static void showIntArray(int len) {
        CountingGenerator.Integer ig = new CountingGenerator.Integer();
        int[] ia = new int[len];
        for (int i = 0; i < len; i++) {
            ia[i] = ig.next();
        }
        System.out.println(Arrays.toString(ia));
    }

    public static void showLongArray(int len) {
        CountingGenerator.Long lg = new CountingGenerator.Long();
        long[] la = new long[len];
        for (int i = 0; i < len; i++) {
            la[i] = lg.next();
        }
        System.out.println(Arrays.toString(la));
    }

    public static void showFloatArray(int len) {
        CountingGenerator.Float fg = new CountingGenerator.Float();
        float[] fa = new float[len];
        for (int i = 0; i < len; i++) {
            fa[i] = fg.next();
        }
        System.out.println(Arrays.toString(fa));
    }

    public static void showDoubleArray(int len) {
        CountingGenerator.Double dg = new CountingGenerator.Double();
        double[] da = new double[len];
        for (int i = 0; i < len; i++) {
            da[i] = dg.next();
        }
        System.out.println(Arrays.toString(da));
    }

    public static void main(String[] args) {
        showShortArray(10);
        showBooleanArray(10);
        showCharArray(10);
        showByteArray(10);
        showIntArray(10);
        showLongArray(10);
        showFloatArray(10);
        showDoubleArray(10);
    }
}