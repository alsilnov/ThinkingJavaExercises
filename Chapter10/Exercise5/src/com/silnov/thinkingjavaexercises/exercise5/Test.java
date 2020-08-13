package com.silnov.thinkingjavaexercises.exercise5;


class Outer {
    class  Inner {
        Inner() {
            System.out.println("new Inner()");
        }
    }
}
public class Test{
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
    }
}