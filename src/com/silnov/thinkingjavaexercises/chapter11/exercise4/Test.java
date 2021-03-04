package com.silnov.thinkingjavaexercises.chapter11.exercise4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedList;


class Generator {
  private int count = 0;
  String next() {
    ++count;
    switch (count) {
      default:
      case 1:
        return "Bill";
      case 2:
        return "Mary";
      case 3:
        count = 0;
        return "Fil";
    }
  }
  Collection<String> fillCollection(Collection<String> col) {
    for(int i = 0; i < 10; ++i) {
      col.add(next());
    }
    return col;
  }
}
public class Test {
  public static void main(String[] args) {
    Generator gen = new Generator();
    System.out.println(gen.fillCollection(new ArrayList<String>()));
    System.out.println(gen.fillCollection(new LinkedList<String>()));
    System.out.println(gen.fillCollection(new HashSet<String>()));
    System.out.println(gen.fillCollection(new LinkedHashSet<String>()));
    System.out.println(gen.fillCollection(new TreeSet<String>()));
  }
}