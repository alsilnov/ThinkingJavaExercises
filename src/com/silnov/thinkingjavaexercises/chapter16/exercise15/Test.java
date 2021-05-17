package com.silnov.thinkingjavaexercises.chapter16.exercise15;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
		CountingGenerator.BerilliumSphere bsg = new CountingGenerator.BerilliumSphere();
        Generated.array(spheres, bsg);
        System.out.println(Arrays.toString(spheres));
    }
}