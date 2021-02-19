package com.silnov.thinkingjavaexercises.chapter12.exercise4;

public class Test extends Exception {  
  private String str;
  Test(String str) {
    this.str = str;
  }
  public void printMsg() {
    System.out.println(str);
  }
  public static void main(String[] args) {
    try {
      throw new Test("TestMsg");
    } catch (Test e) {
      e.printMsg();
    }
  }
}