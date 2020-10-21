package com.silnov.thinkingjavaexercises.exercise1;


public class Test {
  
  public static void main(String[] args) {
    try {
      throw new Exception("Test");
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e.getMessage());
    } finally {
      System.out.println("finally");
    }
  }
}