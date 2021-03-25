package com.silnov.thinkingjavaexercises.chapter10.exercise8;

public class Outer {
    Outer() {
        System.out.println("Outer()");
    }
    void methodOuter() {
        System.out.println("Start methodOuter()");
        Inner in = new Inner();
        in.methodInner();
        System.out.println("feild = " + in.feild);
        in.feild = "Outer";
        System.out.println("feild = " + in.feild);
        System.out.println("Finish methodOuter()");
    }
    class Inner {
        Inner() {
            System.out.println("Inner()");
        }
        private String feild = "Inner";
        private void methodInner() {
            System.out.println("Start methodInner()");
            System.out.println("Finish methodOuter()");
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        out.methodOuter();
    }
}