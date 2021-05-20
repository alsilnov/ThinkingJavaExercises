package com.silnov.thinkingjavaexercises.chapter16.exercise18;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}