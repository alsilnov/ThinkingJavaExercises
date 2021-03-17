
package com.silnov.thinkingjavaexercises.chapter14.exercise15.pets;

public class Gerbil extends Rodent {
  public Gerbil(String name) { super(name); }
  public Gerbil() { super(); }
  public static class Factory implements com.silnov.thinkingjavaexercises.chapter14.exercise15.Factory<Gerbil> {
    public Gerbil create() {
      return new Gerbil();
    }
  } 
}
