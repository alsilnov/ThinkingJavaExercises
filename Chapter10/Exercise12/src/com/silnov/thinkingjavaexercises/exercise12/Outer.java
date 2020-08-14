package com.silnov.thinkingjavaexercises.exercise12;

public class Outer {
    private String feild;
    Outer() {
        System.out.println("Outer()");
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