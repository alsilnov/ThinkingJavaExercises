package com.silnov.thinkingjavaexercises.chapter15.exercise8;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

class StoryCharacter {
  private static long counter = 0;
  private final long id = counter++;

  public String toString() {
    return getClass().getSimpleName() + " " + id;

  }
}

class BadGuy extends StoryCharacter {
}

class GoodGuy extends StoryCharacter {
}

class LukeSkywalker extends GoodGuy {

}

class Yoda extends GoodGuy {
}

class DarthVader extends BadGuy {
}

class JabbaTheHut extends BadGuy {
}

interface Generator<T> {
  T next();
}

public class CharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {
  private Class<?>[] types = { DarthVader.class, JabbaTheHut.class, LukeSkywalker.class, Yoda.class };
  private static Random rand = new Random(47);

  public CharacterGenerator() {
  }

  private int size = 0;

  public CharacterGenerator(int sz) {
    size = sz;
  }

  @Override
  public StoryCharacter next() {
    try {
      return (StoryCharacter) types[rand.nextInt(types.length)].newInstance();
      // Report programmer errors at run time:
    } catch (IllegalAccessException | InstantiationException | IllegalArgumentException | SecurityException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    for (StoryCharacter i : new CharacterGenerator(18)) {
      System.out.println(i + " ");
    }
  }

  @Override
  public Iterator<StoryCharacter> iterator() {
    // TODO Auto-generated method stub
    return new Iterator<StoryCharacter>() {
      int count = size;

      @Override
      public boolean hasNext() {
        return count > 0;
      }

      @Override
      public StoryCharacter next() {
        count--;
        return CharacterGenerator.this.next();
      }

      @Override
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
}
