package com.silnov.thinkingjavaexercises.exercise9;
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
/**
 * C
extends Exception */
class C extends Exception {
  C(String str) {
    super(str);
  }
}
public class Test {
  static void f(String key) throws A, B, C {
    switch (key) {
      case "A":
        throw new A("Exception A from f()");
      case "B":
        throw new B("Exception B from f()");
      case "C":
        throw new C("Exception C from f()");
    }
  }
  public static void main(String[] args) {
    try {
      System.out.println();
      f("A");
      f("B");
      f("C");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}