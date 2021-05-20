package com.silnov.thinkingjavaexercises.chapter6.exercise6.test;

class Prot {
    protected String data = "data";
}

public class Test {
    public static void main(String[] args) {
        System.out.println((new Prot()).data);
    }
}
