package com.silnov.thinkingjavaexercises.chapter16.exercise21;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    static class SphereReverseComparator implements Comparator<BerylliumSphere> {

        @Override
        public int compare(BerylliumSphere o1, BerylliumSphere o2) {
            return (o1.getID() < o2.getID() ? 1 : (o1.getID() == o2.getID() ? 0 : -1));
        }

    }

    public static void main(String[] args) {
        BerylliumSphere[] bsa = new BerylliumSphere[3];
        for (int i = 0; i < bsa.length; i++) {
            bsa[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(bsa));
        Arrays.sort(bsa, new SphereReverseComparator());
        System.out.println(Arrays.toString(bsa));
        Arrays.sort(bsa);
        System.out.println(Arrays.toString(bsa));
    }
}