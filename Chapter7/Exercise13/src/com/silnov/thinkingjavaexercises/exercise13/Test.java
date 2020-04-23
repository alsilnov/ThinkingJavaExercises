package com.silnov.thinkingjavaexercises.exercise13;
class Root {
  //  java does not support overloading by returning value so i use "void"
  void foo() {
    System.out.println("foo()"); 
  }
  void foo(int i) { 
    System.out.println("foo(int i)"); 
  }
  void foo(String i) {
    System.out.println("foo(String i)"); 
  }
}

public class Test extends Root {
  void foo(double i) {
    System.out.println("foo(double i)"); 
  }
  @Override
  void foo(int i) {
    System.out.println("foo(int i) - overriding"); 
  }
  /* @Override                                        // - method does not override or implement a method from a supertype
  void foo(boolean i) {
    System.out.println("foo(bolean i) - overriding"); 
  } */
  public static void main(String[] args) {
    Test x = new Test();
    x.foo();
    x.foo(1);
    x.foo("Sas");
    x.foo(2.0);
  }
}
