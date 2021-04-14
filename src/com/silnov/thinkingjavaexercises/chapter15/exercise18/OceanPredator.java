/** ;) */
package com.silnov.thinkingjavaexercises.chapter15.exercise18;

import java.util.*;

class BigFish {
  private static long counter = 1;
  private final long id = counter++;

  @Override
  public String toString() {
    return "BigFish " + id;
  }
}

class LittleFish {
  private static long counter = 1;
  private final long id = counter++;

  @Override
  public String toString() {
    return "LittleFish " + id;
  }
}

class Ocean {
  private List<OceanPredator> tellers = new ArrayList<>();

  public void put(OceanPredator bt) {
    tellers.add(bt);
  }
}

public class OceanPredator {
  public static void eat(LittleFish t, BigFish c) {
    System.out.println(t + " eats " + c);
  }

  public static void main(String[] args) {
    // Demonstrate create():
    RandomList<LittleFish> littleFishes = Suppliers.create(RandomList::new, LittleFish::new, 4);
    // Demonstrate fill():
    List<BigFish> bigFishes = Suppliers.fill(new ArrayList<>(), BigFish::new, 12);
    bigFishes.forEach(c -> eat(littleFishes.select(), c));
    // Demonstrate assisted latent typing:
    Ocean ocean = Suppliers.fill(new Ocean(), Ocean::put, OceanPredator::new, 3);
    // Can also use second version of fill():
    List<BigFish> bigFishes2 = Suppliers.fill(new ArrayList<>(), List::add, BigFish::new, 12);
  }
}
