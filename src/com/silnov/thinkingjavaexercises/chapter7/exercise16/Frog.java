package com.silnov.thinkingjavaexercises.chapter7.exercise16;

class Amphibian {
    protected void printClassName() {
        System.out.println("Class Amphibian");
    }
}

public class Frog extends Amphibian {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.printClassName();
    }
}