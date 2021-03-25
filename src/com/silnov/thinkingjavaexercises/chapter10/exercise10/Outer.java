package com.silnov.thinkingjavaexercises.chapter10.exercise10;

interface MyInterface {
    void interfaceMethod();
}
public class Outer {
    Outer() {
        System.out.println("Outer()");
    }
    MyInterface outerMethod(boolean x) {
        if(x) {
            class MyInterfaceRealization implements MyInterface {
                public void interfaceMethod() {
                    System.out.println("MyInterfaceRealization with true");
                }
            }
            return new MyInterfaceRealization();
        } else {
            class MyInterfaceRealization implements MyInterface {
                public void interfaceMethod() {
                    System.out.println("MyInterfaceRealization with false");
                }
            }
            return new MyInterfaceRealization();
        }
}
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod(true).interfaceMethod();
        out.outerMethod(false).interfaceMethod();
    }
}