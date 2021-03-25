package com.silnov.thinkingjavaexercises.chapter10.exercise1;


public  class Outer {
    class  Inner {
        Inner() {
            System.out.println("new Inner()");
        }
    }
    Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        Inner in = out.getInner();
    }
}