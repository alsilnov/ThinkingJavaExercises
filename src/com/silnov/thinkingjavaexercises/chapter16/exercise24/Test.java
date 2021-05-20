package com.silnov.thinkingjavaexercises.chapter16.exercise24;

import java.util.Arrays;
import java.util.Random;

public class Test implements Comparable<Test> {
    private int n;

    Test(int n) {
        this.n = n;
    }

    public int compareTo(Test b) {
        return (this.n < b.n ? -1 : (this.n == b.n ? 0 : 1));
    }

    @Override
    public String toString() {

        return "Test " + n;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj.getClass().getSimpleName() == "A" && this.n == ((Test) obj).n) ? true : false;
    }

    public static void main(String[] args) {
        Test[] a1 = new Test[10];
        Random r = new Random();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = new Test(r.nextInt(20));
        }
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        int index = Arrays.binarySearch(a1, new Test(r.nextInt(20)));
        if (index >= 0) {
            System.out.println("Index: " + index + ", " + a1[index]);
        }
    }
}