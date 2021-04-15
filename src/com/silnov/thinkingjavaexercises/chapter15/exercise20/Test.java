package com.silnov.thinkingjavaexercises.chapter15.exercise20;

interface FooBar {
    void foo();

    void bar();
}

class FooBarImplementation implements FooBar {

    @Override
    public void foo() {
        System.out.println("foo();");
    }

    @Override
    public void bar() {
        System.out.println("bar();");
    }
}

public class Test {
    static <T extends FooBar> void method(T x) {
        x.foo();
        x.bar();
    }

    public static void main(String[] args) {
        method(new FooBarImplementation());
    }
}
