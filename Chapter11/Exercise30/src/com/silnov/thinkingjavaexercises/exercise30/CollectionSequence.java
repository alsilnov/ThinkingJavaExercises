package com.silnov.thinkingjavaexercises.exercise30;
import com.silnov.thinkingjavaexercises.exercise30.pets.*;
import java.util.*;

class InterfaceVsIterator {
  public static void display(Iterator<Pet> it) {
    while(it.hasNext()) {
      Pet p = it.next();
      System.out.print(p.id() + ":" + p + " ");
    }
    System.out.println();
  }
  public static void display(Collection<Pet> pets) {
    for(Pet p : pets)
      System.out.print(p.id() + ":" + p + " ");
    System.out.println();
  }
}
public class CollectionSequence implements Collection {
  private Pet[] pets = Pets.array(8);
  @Override
  public int size() { return pets.length; }
  @Override
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() { // [1]
      private int index = 0;
      @Override
      public boolean hasNext() {
        return index < pets.length;
      }
      @Override
      public Pet next() { return pets[index++]; }
      @Override
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean contains(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Object[] toArray() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object[] toArray(Object[] a) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean add(Object e) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean remove(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean retainAll(Collection c) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub

  }
}