package com.silnov.thinkingjavaexercises.exercise11;

interface MyInterface {
    void interfaceMethod();
}
public class Outer {
    Outer() {
        System.out.println("Outer()");
    }
    private class MyInterfaceRealization implements MyInterface {
        public void interfaceMethod() {
            System.out.println("MyInterfaceRealization");
        }
    }
    MyInterface outerMethod() {
           return new MyInterfaceRealization();
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod().interfaceMethod();
        //((MyInterfaceRealization)(out.outerMethod())).interfaceMethod();
    }
}