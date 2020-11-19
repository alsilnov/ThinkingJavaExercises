package com.silnov.thinkingjavaexercises.exercise28;

public class Test extends RuntimeException {  
  private String str;
  Test(String str) {
    this.str = str;
  }
  @Override

  public String toString() {
    return str;
  }
  public static void main(String[] args) {
      throw new Test("TestMsg");
  }
}