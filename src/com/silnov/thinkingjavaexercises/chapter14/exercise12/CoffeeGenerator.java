package com.silnov.thinkingjavaexercises.chapter14.exercise12;
import java.util.*;

interface Generator<T> {
    T next();
}
class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
}
class Cappuccino extends Coffee {}
class Americano extends Coffee {}
class Mocha extends Coffee {}
class Latte extends Coffee {}
class Breve extends Coffee {}

public class CoffeeGenerator
implements Generator<Coffee>, Iterable<Coffee> {
  private Class[] types = { Latte.class, Mocha.class,
    Cappuccino.class, Americano.class, Breve.class, };
  private static Random rand = new Random(47);
  public CoffeeGenerator() {}
  // For iteration:
  private int size = 0;
  public CoffeeGenerator(int sz) { size = sz; }	
  public Coffee next() {
    try {
      return (Coffee)
        types[rand.nextInt(types.length)].newInstance();
      // Report programmer errors at run time:
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
  class CoffeeIterator implements Iterator<Coffee> {
    int count = size;
    public boolean hasNext() { return count > 0; }
    public Coffee next() {
      count--;
      return CoffeeGenerator.this.next();
    }
    public void remove() { // Not implemented
      throw new UnsupportedOperationException();
    }
  };	
  public Iterator<Coffee> iterator() {
    return new CoffeeIterator();
  }
  public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Coffee.class);
		for(Coffee coffee : new CoffeeGenerator(20)) {
			System.out.print(coffee.getClass().getSimpleName() + " ");
			counter.count(coffee);
		}
		System.out.println();
		System.out.println(counter);
  }
}