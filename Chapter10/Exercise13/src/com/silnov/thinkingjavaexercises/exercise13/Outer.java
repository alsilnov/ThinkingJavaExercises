package com.silnov.thinkingjavaexercises.exercise13;

interface MyInterface {
    void interfaceMethod();
}
public class Outer {
    Outer() {
        System.out.println("Outer()");
    }
    MyInterface outerMethod() {
        return new  MyInterface() {
            public void interfaceMethod() {
                System.out.println("MyInterfaceRealization");
            }
        };
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod().interfaceMethod();
    }
}