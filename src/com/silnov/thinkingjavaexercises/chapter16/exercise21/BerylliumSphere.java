package com.silnov.thinkingjavaexercises.chapter16.exercise21;

class BerylliumSphere implements Comparable<BerylliumSphere> {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }

    public long getID() {
        return id;
    }

    @Override
    public int compareTo(BerylliumSphere o) {
        return (id < o.id ? -1 : (id == o.id ? 0 : 1));
    }
}