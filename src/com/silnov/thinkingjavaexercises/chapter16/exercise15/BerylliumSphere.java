package com.silnov.thinkingjavaexercises.chapter16.exercise15;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}