package com.silnov.thinkingjavaexercises.exercise12;

class Root {
    A1 a1 = new A1("in Root");
    A2 a2 = new A2("in Root");
    A3 a3 = new A3("in Root");

    Root() {
        System.out.println("Constructor Root()");
    }

    void dispose() {
        System.out.println("Closig Root()");
        a3.dispose("in Root");
        a2.dispose("in Root");
        a1.dispose("in Root");
    }
}

class A1 {
    A1(String str) {
        System.out.println("Constructor A1(" + str + ")");
    }

    void dispose(String str) {
        System.out.println("Closig A1(" + str + ")");
    }
}

class A2 {
    A2(String str) {
        System.out.println("Constructor A2(" + str + ")");
    }

    void dispose(String str) {
        System.out.println("Closig A2(" + str + ")");
    }
}

class A3 {
    A3(String str) {
        System.out.println("Constructor A3(" + str + ")");
    }

    void dispose(String str) {
        System.out.println("Closig A3(" + str + ")");
    }
}

public class Stem extends Root {
    A1 a1 = new A1("in Stem");
    A2 a2 = new A2("in Stem");
    A3 a3 = new A3("in Stem");

    Stem() {
        System.out.println("Constructor Stem()");
    }

    void dispose() {
        System.out.println("Closig Stem()");
        a3.dispose("in Stem");
        a2.dispose("in Stem");
        a1.dispose("in Stem");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem x = new Stem();
        x.dispose();
    }
}
