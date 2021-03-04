package com.silnov.thinkingjavaexercises.chapter11.exercise28;

import java.util.*;
/**
 * Test
 */
public class Test {
  public static void main(String[] args) {
    PriorityQueue<Double> pq = new PriorityQueue<Double>();
    Random random = new Random();
    for(int i  = 0; i < 10; ++i) {
      pq.offer(random.nextDouble());
    }
    while (pq.peek() != null) {
      System.out.println(pq.poll());
    }  
  }
}