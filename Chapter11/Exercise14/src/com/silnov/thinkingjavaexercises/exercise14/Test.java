package com.silnov.thinkingjavaexercises.exercise14;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Test
 */
public class Test {
  private static void listAddInteger(LinkedList<Integer> list, Integer[] intArray) {
    for (Integer i : intArray) {
      ListIterator<Integer> it = list.listIterator((list.size())/2);
      it.add(i);
      System.out.println(list);
    }
  }
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    listAddInteger(list, intArray);
  }
}