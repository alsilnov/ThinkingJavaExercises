package com.silnov.thinkingjavaexercises.chapter7.exercise23;

class A {
    static int a;
    static {
        a = 1;
        System.out.println("A.a init");
    }

    A() {
        System.out.println("Constractor A");
    }
}

class B extends A {
    static int b;
    static {
        b = 1;
        System.out.println("B.b init");
    }

    B() {
        System.out.println("Constractor B");
    }
}

class D {
    static int d;
    static {
        d = 1;
        System.out.println("D.d init");
    }

    D() {
        System.out.println("Constractor D");
    }
}

public class Test extends B {
    static int test;
    static {
        test = 1;
        System.out.println("Test.test init");
    }

    Test() {
        System.out.println("Constractor Test");
    }

    public static void main(String[] args) {
        System.out.println("Hi from  Test");
        Test test = new Test();
        D.d = 2;
    }
}