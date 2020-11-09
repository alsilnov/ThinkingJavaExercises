package com.silnov.thinkingjavaexercises.exercise12;
interface Selector {
  boolean end();
  Object current();
  void next();
}

public class Sequence {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) {
    items = new Object[size];
  }
  public void add(Object x) {
    try {
      items[next++] = x;
    } catch (Exception  e) {
      System.out.println("It is unable to add item to sequence");
    }
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    @Override
    public boolean end() { return i == items.length; }
    @Override
    public Object current() { return items[i]; }
    @Override
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }
  public static void main(String[] args) {
    Sequence sequence = new Sequence(10);
    for(int i = 0; i < 12; i++) {
      sequence.add(Integer.toString(i));
    }
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
    System.out.println();
  }
}