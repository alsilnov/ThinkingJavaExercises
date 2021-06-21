package com.silnov.thinkingjavaexercises.chapter15.exercise34;

abstract class SelfBounded<T extends SelfBounded<T>> {
    abstract T foo(T a);

    T bar(T a) {
        return foo(a);
    }

}

class A extends SelfBounded<A> {

    @Override
    A foo(A a) {
        System.out.println("foo(A arg)");
        return a;
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.foo(a).bar(a);
    }

}