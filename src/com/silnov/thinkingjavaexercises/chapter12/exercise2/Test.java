package com.silnov.thinkingjavaexercises.chapter12.exercise2;

public class Test {  
  public static void main(String[] args) {
    String str = null;
    try {
      System.out.println(str.length());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}