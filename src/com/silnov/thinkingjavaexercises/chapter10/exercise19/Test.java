package com.silnov.thinkingjavaexercises.chapter10.exercise19;

class Outer {
    @Override
    public String toString() {
        return "Outer";
    }

    class Inner {
        @Override
        public String toString() {
            return "Inner";
        }

        class InnerInner {
            @Override
            public String toString() {
                return "InnerInner";
            }
        }
    }

    static class StaticInner {
        @Override
        public String toString() {
            return "StaticInner";
        }

        static class StaticInnerInner {
            @Override
            public String toString() {
                return "StaticInnerInner";
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer.StaticInner staticIn = new Outer.StaticInner();
        System.out.println(staticIn);
        Outer.StaticInner.StaticInnerInner staticInIn = new Outer.StaticInner.StaticInnerInner();
        System.out.println(staticInIn);

        Outer out = new Outer();
        System.out.println(out);
        Outer.Inner in = out.new Inner();
        System.out.println(in);
        Outer.Inner.InnerInner inIn = in.new InnerInner();
        System.out.println(inIn);
    }
}
