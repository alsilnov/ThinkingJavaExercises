package com.silnov.thinkingjavaexercises.chapter10.exercise6.One;

import com.silnov.thinkingjavaexercises.chapter10.exercise6.Two.MyInterface;

public class Outer {
    protected class Inner implements MyInterface {
        public Inner() {
            System.out.println("new Inner()");
        }

        public String myInterfaceMethod() {
            return "Inner myInterfaceMethod()";
        }
    }
}