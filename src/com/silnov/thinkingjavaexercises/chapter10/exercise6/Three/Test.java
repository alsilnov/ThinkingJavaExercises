package com.silnov.thinkingjavaexercises.chapter10.exercise6.Three;
import com.silnov.thinkingjavaexercises.chapter10.exercise6.One.*;
import com.silnov.thinkingjavaexercises.chapter10.exercise6.Two.MyInterface;

public class Test extends Outer {
    MyInterface outer() {
        return this.new Inner();
    }
    public static void main(String[] args) {
        Test out = new Test();
        System.out.println(out.outer().myInterfaceMethod());
    }
}