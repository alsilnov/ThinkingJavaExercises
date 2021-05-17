package com.silnov.thinkingjavaexercises.chapter16.exercise10;

import java.util.*;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class ArrayOfGeneric {

    public static void main(String[] args) {
        List<List<String>> lls = new ArrayList<List<String>>();
        List<List> l = new ArrayList<List>();
        // lls = (List<List<String>>)l; // error: inconvertible types
        lls.add(new ArrayList<String>());
        List<Object> lo = new ArrayList<Object>();
        // lo = lls; // error: incompatible types
        // Compile-time warning eliminated:
        List<List<BerylliumSphere>> llb = new ArrayList<List<BerylliumSphere>>();
        for (int i = 0; i < 10; i++) {
            llb.add(new ArrayList<BerylliumSphere>());
            for (int j = 0; j < 2; j++)
                llb.get(i).add(new BerylliumSphere());
        }
        System.out.println(llb);
    }
}
