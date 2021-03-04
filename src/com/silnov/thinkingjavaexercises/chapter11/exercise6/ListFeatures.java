package com.silnov.thinkingjavaexercises.chapter11.exercise6;

import java.util.*;

public class ListFeatures {
  private static List<String> randomString(int lenght, int maxValue) {
    List<String> list = new ArrayList<String>();
    Random rand = new Random(3547);
    while (lenght-- != 0) {
      list.add(Integer.toString(rand.nextInt(maxValue)));
    }
    return list;
  }
  public static void main(String[] args) {
    Random rand = new Random(3203);
    List<String> strs = randomString(20, 27);
    System.out.println("1: " + strs);
    String h = Integer.toString(rand.nextInt(27));
    strs.add(h); // Automatically resizes
    System.out.println("2: " + strs);
    System.out.println("3: " + strs.contains(h));
    strs.remove(h); // Remove by object
    String p = strs.get(2);
    System.out.println("4: " +  p + " " + strs.indexOf(p));
    String cymric = Integer.toString(rand.nextInt(27));
    System.out.println("5: " + strs.indexOf(cymric));
    System.out.println("6: " + strs.remove(cymric));
    // Must be the exact object:
    System.out.println("7: " + strs.remove(p));
    System.out.println("8: " + strs);
    strs.add(3, Integer.toString(rand.nextInt(27))); // Insert at an index
    System.out.println("9: " + strs);
    List<String> sub = strs.subList(1, 4);
    System.out.println("subList: " + sub);
    System.out.println("10: " + strs.containsAll(sub));
    Collections.sort(sub); // In-place sort
    System.out.println("sorted subList: " + sub);
    // Order is not important in containsAll():
    System.out.println("11: " + strs.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    System.out.println("shuffled subList: " + sub);
    System.out.println("12: " + strs.containsAll(sub));
    List<String> copy = new ArrayList<>(strs);
    sub = Arrays.asList(strs.get(1), strs.get(4));
    System.out.println("sub: " + sub);
    copy.retainAll(sub);
    System.out.println("13: " + copy);
    copy = new ArrayList<>(strs); // Get a fresh copy
    copy.remove(2); // Remove by index
    System.out.println("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    System.out.println("15: " + copy);
    copy.set(1, Integer.toString(rand.nextInt(27))); // Replace an element
    System.out.println("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    System.out.println("17: " + copy);
    System.out.println("18: " + strs.isEmpty());
    strs.clear(); // Remove all elements
    System.out.println("19: " + strs);
    System.out.println("20: " + strs.isEmpty());
    strs.addAll(randomString(10, 37));
    System.out.println("21: " + strs);
    Object[] o = strs.toArray();
    System.out.println("22: " + o[3]);
    String[] pa = strs.toArray(new String[0]);
    System.out.println("23: " + pa[3]);
  }
}