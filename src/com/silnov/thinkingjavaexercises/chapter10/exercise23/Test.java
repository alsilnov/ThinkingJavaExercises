package com.silnov.thinkingjavaexercises.chapter10.exercise23;

interface U {
    void uMethod1();

    void uMethod2();

    void uMethod3();
}

class A {
    U aMethod() {
        return new U() {
            public void uMethod1() {
                System.out.println("uMethod1");
            }

            public void uMethod2() {
                System.out.println("uMethod2");
            }

            public void uMethod3() {
                System.out.println("uMethod3");
            }
        };
    }
}

class B {
    U[] uArray;

    B(int i) {
        uArray = new U[i];
    }

    void uArrayAdd(U ref, int i) {
        uArray[i] = ref;
    }

    void uArrayRemove(int i) {
        uArray[i] = null;
    }

    void uArrayIteration() {
        for (U tmp : uArray) {
            tmp.uMethod1();
            tmp.uMethod2();
            tmp.uMethod3();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        B b = new B(4);
        b.uArrayAdd(a1.aMethod(), 0);
        b.uArrayAdd(a2.aMethod(), 1);
        b.uArrayAdd(a3.aMethod(), 2);
        b.uArrayAdd(a4.aMethod(), 3);
        b.uArrayIteration();
    }
}