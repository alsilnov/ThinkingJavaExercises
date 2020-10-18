package com.silnov.thinkingjavaexercises.exercise32;
import com.silnov.thinkingjavaexercises.exercise32.pets.*;
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

class PetSequence {
  protected Pet[] pets = Pets.array(8);
}

public class NonCollectionSequence extends PetSequence  implements Iterable {
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
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
  public Iterable<Pet> reversed() {
    return new Iterable<Pet>() {
      public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
          int current = pets.length - 1;
          public boolean hasNext() {
            return current > -1;
          }
          public Pet next() {
            return pets[current--];
          }
          public void remove() { // Not implemented
            throw new UnsupportedOperationException();
          }
        };
      }
    };
  }
  public Iterable<Pet> randomized() {
    return new Iterable<Pet>() {
      public Iterator<Pet> iterator() {
        List<Pet> shuffled =
          new ArrayList<Pet>(Arrays.asList(pets));
        Collections.shuffle(shuffled, new Random());
        return shuffled.iterator();
      }
    };
  }
  public static void main(String[] args) {
    NonCollectionSequence nc =
      new NonCollectionSequence();
      for (Pet p : nc.pets) {
        System.out.print(p + " ");
      }
      System.out.println();
      for (Pet p : nc.reversed()) {
        System.out.print(p + " ");
      }
      System.out.println();
      for (Pet p : nc.randomized()) {
        System.out.print(p + " ");
      }
      System.out.println();
  }
}