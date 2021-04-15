package com.silnov.thinkingjavaexercises.exercise8;

public class Test extends A {
    Test() {
        super(1);
        System.out.println("Constructor Test()");
    }

    Test(int i) {
        super(i);
        System.out.println("Constructor Test(int i)");
    }

    public static void main(String[] args) {
        Test test = new Test(1);
    }
}

class A {
    A(int i) {
        System.out.println("Constructor A(int i)");
    }
}