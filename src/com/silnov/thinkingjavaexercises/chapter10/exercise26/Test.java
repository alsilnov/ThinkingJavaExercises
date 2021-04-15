package com.silnov.thinkingjavaexercises.chapter10.exercise26;

class Outer {
    class Inner {
        Inner(int i) {
        }
    }
}

public class Test {
    class InheritInner extends Outer.Inner {
        InheritInner(Outer out) {
            out.super(6);
        }
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Test test = new Test();
        InheritInner in = test.new InheritInner(out);
    }

}