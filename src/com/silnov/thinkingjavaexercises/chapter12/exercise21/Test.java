package com.silnov.thinkingjavaexercises.chapter12.exercise21;

/**
 * AException extends Exception
 */
class AException extends Exception {
}

/**
 * A
 */
class A {
    A() throws AException {
        throw new AException();
    }
}

public class Test extends A {
    Test() throws AException {
        // try {
        // super();
        // } catch(BaseException e) {}
    }

    public static void main(String[] args) {
        try {
            Test test = new Test();
        } catch (AException e) {
            System.out.println("AException caught in main()");
        }
    }
}