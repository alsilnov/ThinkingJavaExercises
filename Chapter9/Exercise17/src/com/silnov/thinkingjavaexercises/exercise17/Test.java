package com.silnov.thinkingjavaexercises.exercise17;
interface A {
    int t = 4;
}
public class Test implements A {
    public static void main(String[] args) {
        System.out.println(t);
        //t = 1;
    }
}
