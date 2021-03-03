package com.silnov.thinkingjavaexercises.chapter14.exercise2;
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Testing class Class
import java.lang.reflect.InvocationTargetException;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Plastic {}

class Toy {
  // Comment out the following no-arg
  // constructor to see NoSuchMethodError
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots, Plastic {
  FancyToy() { super(1); }
}

public class ToyTest {
  static void printInfo(Class cc) {
    System.out.println("Class name: " + cc.getName() +
      " is interface? [" + cc.isInterface() + "]");
    System.out.println(
      "Simple name: " + cc.getSimpleName());
    System.out.println(
      "Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("com.silnov.thinkingjavaexercises.chapter14.exercise2.FancyToy");
    } catch(ClassNotFoundException e) {
      System.out.println("Can't find FancyToy");
      System.exit(1);
    }
    printInfo(c);
    for(Class face : c.getInterfaces())
      printInfo(face);
    Class up = c.getSuperclass();
    Object obj = null;
    try {
      // Requires no-arg constructor:
      obj = up.newInstance();
    } catch(Exception e) {
      throw new
        RuntimeException("Cannot instantiate");
    }
    printInfo(obj.getClass());
  }
}