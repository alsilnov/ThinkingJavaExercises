package com.silnov.thinkingjavaexercises.chapter12.exercise5;

public class Test extends Exception {

  public static void main(String[] args) {
    int[] iArray = {1};
    int i = 5;
    while(true){
      try {
        iArray[i] = 5;
        System.out.println("OK");
        break;
      } catch (IndexOutOfBoundsException e) {
        e.printStackTrace();
        i--;
      }
    }
  }
}