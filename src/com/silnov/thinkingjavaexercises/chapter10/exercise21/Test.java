package com.silnov.thinkingjavaexercises.chapter10.exercise21;

interface In {
    void testInterfacemethod();

    class Nested {
        static void testStaticMethod(In tmp) {
            System.out.println("testStaticMethodStart");
            tmp.testInterfacemethod();
            System.out.println("testStaticMethodFinish");
        }

    }
}

public class Test implements In {
    @Override
    public void testInterfacemethod() {
        System.out.println("testInterfaceMethod");
    }

    public static void main(String[] args) {
        In test = new Test();
        In.Nested.testStaticMethod(test);
    }
}