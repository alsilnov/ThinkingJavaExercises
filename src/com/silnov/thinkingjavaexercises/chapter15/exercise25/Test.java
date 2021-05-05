package com.silnov.thinkingjavaexercises.chapter15.exercise25;

interface AI {
}

interface BI {
}

class ClassAB implements AI, BI {
}

public class Test {
    <T extends AI> void foo(T a) {
    }

    <T extends BI> void bar(T a) {
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.foo(new ClassAB());
        t.bar(new ClassAB());
    }
}