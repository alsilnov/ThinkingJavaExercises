package com.silnov.thinkingjavaexercises.chapter5.exercise9;

class Test {
    Test() {
        System.out.println("x");
    }

    Test(int i) {
        this();
        System.out.println("y");
    }

    public static void main(String[] args) {
        Test test = new Test(1);
    }
}
