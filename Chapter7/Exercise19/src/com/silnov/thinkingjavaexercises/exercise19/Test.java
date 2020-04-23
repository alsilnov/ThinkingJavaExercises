package com.silnov.thinkingjavaexercises.exercise19;

public class Test {
  final int F;
  Test() {
    F = 1;
  }
  public static void main(String[] args) {
    Test test = new Test();
    //test.F = 2; // - not work
    System.out.println(test.F);
  }
}