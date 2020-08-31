package com.silnov.thinkingjavaexercises.exercise12;

import java.util.*;

/**
 * Test
 */
public class Test {

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    ListIterator<Integer> it1 = list1.listIterator();
    ListIterator<Integer> it2 = list2.listIterator();
    while (it1.hasNext()) {
      it1.next();
    }
    while (it2.hasNext()) {
      it2.next();
      it2.set(it1.previous());
    }
    System.out.println(list2);
  }
}