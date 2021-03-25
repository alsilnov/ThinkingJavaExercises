package com.silnov.thinkingjavaexercises.chapter10.exercise9;

interface MyInterface {
    void interfaceMethod();
}
public class Outer {
    Outer() {
        System.out.println("Outer()");
    }
    MyInterface outerMethod() {
        class MyInterfaceRealization implements MyInterface {
            public void interfaceMethod() {
                System.out.println("MyInterfaceRealization");
            }
        }
        return new MyInterfaceRealization();
    }
    
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod().interfaceMethod();
    }
}