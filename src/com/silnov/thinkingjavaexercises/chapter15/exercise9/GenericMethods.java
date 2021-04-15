package com.silnov.thinkingjavaexercises.chapter15.exercise9;

public class GenericMethods {
    public <A, B, C> void f(A a, B b, C c) {
        System.out.println(a.getClass().getName() + " " + b.getClass().getName() + " " + c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, 1.0);
        gm.f(1.0F, 'c', gm);
    }
}