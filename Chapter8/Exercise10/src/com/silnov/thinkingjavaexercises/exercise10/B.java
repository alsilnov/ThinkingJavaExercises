package com.silnov.thinkingjavaexercises.exercise10;
class A {
    public void foo() {
        System.out.println("A.foo()");
    }
    public void bar() {
        this.foo();
    }
}
public class B extends A {
    public void foo() {
        System.out.println("B.foo()");
    }   
    public static void main(String[] args) {
        B b = new B();
        b.bar();
    }
}
