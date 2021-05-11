package com.silnov.thinkingjavaexercises.chapter16.exercise1;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere" + id;
    }
}

public class Test {
    static void foo(BerylliumSphere[] a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        foo(new BerylliumSphere[]{new BerylliumSphere()});
    }
}
