package com.silnov.thinkingjavaexercises.chapter10.exercise12;

class Inner {
    Inner() {
        System.out.println("Inner()");
    }
    void methodInner() {
    }
}
public class Outer {
    private String feild;
    Outer() {
        System.out.println("Outer()");
    }
    private void methodOuter() {
        System.out.println("Start methodOuter()");
        System.out.println("Finish methodOuter()");
    }
    void methodOuterTwo() {
        System.out.println("Start methodOuterTwo()");
        Inner in = new Inner() {
            void methodInner() {
                System.out.println("Start methodInner()");
                feild = "Inner";
                System.out.println("feild = " + feild);
                methodOuter();
                System.out.println("Finish methodOuter()");
            }
        };
        in.methodInner();
        System.out.println("Finish methodOuterTwo()");
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        out.methodOuterTwo();
    }
}