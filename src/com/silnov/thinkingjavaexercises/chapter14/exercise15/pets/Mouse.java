// typeinfo/pets/Mouse.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.silnov.thinkingjavaexercises.chapter14.exercise15.pets;

public class Mouse extends Rodent {
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }
  public static class Factory implements com.silnov.thinkingjavaexercises.chapter14.exercise15.Factory<Mouse> {
    public Mouse create() {
      return new Mouse();
    }
  } 
}
