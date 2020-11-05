package com.silnov.thinkingjavaexercises.exercise10;
/**
 * A
extends Exception */
class A extends Exception {
  A(String str) {
    super(str);
  }
}
/**
 * B
extends Exception */
class B extends Exception {
  B(String str) {
    super(str);
  }
}

public class Test {
  static void g() throws A {
    System.out.println("In g()");
    throw new A("A was thrown from g()");
  }
  static void f() throws B {
    try {
      System.out.println("In f()");
      g();
    } catch (A e) {
      e.printStackTrace();
      throw new B("B was thrown from f()");
    }
  }
  public static void main(String[] args) {
    try {
      System.out.println("In main()");
      f();
    } catch (B e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }
}