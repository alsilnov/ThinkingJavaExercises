package com.silnov.thinkingjavaexercises.chapter7.exercise9;

class Root {
    A1 a1 = new A1("in Root");
    A2 a2 = new A2("in Root");
    A3 a3 = new A3("in Root");

    Root() {
        System.out.println("Constructor Root()");
    }
}

class A1 {
    A1(String str) {
        System.out.println("Constructor A1(" + str + ")");
    }
}

class A2 {
    A2(String str) {
        System.out.println("Constructor A2(" + str + ")");
    }
}

class A3 {
    A3(String str) {
        System.out.println("Constructor A3(" + str + ")");
    }
}

public class Stem extends Root {
    A1 a1 = new A1("int Stem");
    A2 a2 = new A2("int Stem");
    A3 a3 = new A3("int Stem");

    Stem() {
        System.out.println("Constructor Stem()");
    }

    public static void main(String[] args) {
        new Stem();
    }
}
