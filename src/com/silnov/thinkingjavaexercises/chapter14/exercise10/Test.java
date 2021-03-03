package com.silnov.thinkingjavaexercises.chapter14.exercise10;

public class Test {
  public static void main(String[] args) {
    char[] c = new char[10];
    System.out.println("Superclass of char[] c: " + c.getClass().getSuperclass().getSimpleName());
    System.out.println("char[] c instanceof Object: " + (c instanceof Object));
  }
}