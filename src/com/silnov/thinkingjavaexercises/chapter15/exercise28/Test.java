package com.silnov.thinkingjavaexercises.chapter15.exercise28;

class Generic1<T> {
    T a;

    void foo(T a) {
        this.a = a;
        System.out.println(a);
    }
}

class Generic2<T> {
    T a;

    T bar() {
        return a;
    }
}

public class Test {
    <T> void contra(Generic1<? super T> arg, T t) {
        arg.foo(t);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.contra(new Generic1<Integer>(), 1);
    }
}