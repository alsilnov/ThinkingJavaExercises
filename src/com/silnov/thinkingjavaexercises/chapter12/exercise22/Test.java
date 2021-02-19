package com.silnov.thinkingjavaexercises.chapter12.exercise22;

class FallingConstructor {
  Integer[] ia = new Integer[2];
  FallingConstructor() throws Exception {
    ia[2] = 0;
  }
}
public class Test {
  public static void main(String[] args) {
    try {
      FallingConstructor test = new FallingConstructor();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}