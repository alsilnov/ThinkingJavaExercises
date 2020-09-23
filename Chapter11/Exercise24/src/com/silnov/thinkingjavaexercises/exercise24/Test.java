package com.silnov.thinkingjavaexercises.exercise24;
import java.util.*;
/**
 * Test
 */
public class Test {
  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
    lhm.put("ten", 10);
		lhm.put("nine", 9);
		lhm.put("eight", 8);
		lhm.put("seven", 7);
		lhm.put("six", 6);
		lhm.put("five", 5);
		lhm.put("four", 4);
		lhm.put("three", 3);
		lhm.put("two", 2);
		lhm.put("one", 1);
    lhm.put("zero", 0);
    System.out.println(lhm);
    Set<String> keysSet = new TreeSet<String>(lhm.keySet());
    Iterator<String> lhmIterator = keysSet.iterator();
    LinkedHashMap<String, Integer> lhmNew = new LinkedHashMap<String, Integer>();
    while(lhmIterator.hasNext()) {
      String str = lhmIterator.next();
      lhmNew.put(str, lhm.get(str));
      lhm.remove(str);
    }
    lhmIterator = keysSet.iterator();
    while (lhmIterator.hasNext()) {
      String str = lhmIterator.next();
      lhm.put(str, lhmNew.get(str));
    }
    lhmNew.clear();
    System.out.println(lhm);
  }
}