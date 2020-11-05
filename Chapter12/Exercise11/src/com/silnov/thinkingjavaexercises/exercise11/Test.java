package com.silnov.thinkingjavaexercises.exercise11;
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
  static void f() throws RuntimeException {
    try {
      System.out.println("In f()");
      g();
    } catch (A e) {
      e.printStackTrace();
      System.out.println("In f() catch");
      throw new RuntimeException(e);
    }
  }
  public static void main(String[] args) {
    try {
      System.out.println("In main()");
      f();
    } catch (RuntimeException e) {
      e.printStackTrace();
      System.out.println("In main() catch");
      System.out.println(e);
    }
  }
}