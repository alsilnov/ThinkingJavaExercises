package com.silnov.thinkingjavaexercises.chapter7.exercise17;

class Amphibian {
    protected void printClassName() {
        System.out.println("Class Amphibian");
    }
}

public class Frog extends Amphibian {
    @Override
    protected void printClassName() {
        System.out.println("Class Frog");
    }

    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.printClassName();
    }
}