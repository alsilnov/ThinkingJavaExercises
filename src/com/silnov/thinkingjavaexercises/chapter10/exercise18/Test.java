package com.silnov.thinkingjavaexercises.chapter10.exercise18;

class Outer {
    @Override
    public String toString() {
        return "Outer";
    }

    public static class Inner {
        @Override
        public String toString() {
            return "Inner";
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        System.out.println(in);
    }
}
