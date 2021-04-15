package com.silnov.thinkingjavaexercises.chapter9.exercise4;

abstract class Super {

}

class Sub extends Super {
    void print() {
        System.out.println("Sub");
    }

}

abstract class Dad {
    abstract void print();
}

class Son extends Dad {
    void print() {
        System.out.println("Son");
    }
}

public class Test {
    static void foo(Super s) {
        ((Sub) s).print();
    }

    static void bar(Dad s) {
        s.print();
    }

    public static void main(String[] args) {
        Test.foo(new Sub());
        Test.bar(new Son());
    }
}