package com.silnov.thinkingjavaexercises.exercise2;
import java.util.*;
import java.util.*;
import java.util.stream.*;

public class InfiniteRecursion {
  @Override public String toString() {
    return
      " InfiniteRecursion address: " + super.toString() + "\n";
  }
  public static void main(String[] args) {
    List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
    for (int i = 0; i < 10; i++) {
      v.add(new InfiniteRecursion());
    }
    System.out.println(v);
  }
}