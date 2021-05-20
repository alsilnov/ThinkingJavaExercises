package com.silnov.thinkingjavaexercises.chapter5.exercise8;

class Test {
    void foo() {
        bar();
        this.bar();
    }

    void bar() {
        System.out.println("x");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
    }
}
