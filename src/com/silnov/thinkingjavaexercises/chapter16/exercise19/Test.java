package com.silnov.thinkingjavaexercises.chapter16.exercise19;

public class Test {
    private int n;

    Test(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        Test[] a1 = new Test[10];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = new Test(1);
        }
        Test[] a2 = new Test[10];
        for (int i = 0; i < a1.length; i++) {
            a2[i] = new Test(1);
        }
        System.out.println(a1.equals(a2));
    }
}