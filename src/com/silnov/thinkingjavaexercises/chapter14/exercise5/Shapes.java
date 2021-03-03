package com.silnov.thinkingjavaexercises.chapter14.exercise5;
import java.util.stream.*;
// typeinfo/Shapes.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  @Override
  public abstract String toString();
}

class Circle extends Shape {
  @Override
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  @Override
  public String toString() { return "Square"; }
}
class Rhomboid extends Shape {
    @Override
    public String toString() { return "Rhomboid"; }
  }

class Triangle extends Shape {
  @Override
  public String toString() { return "Triangle"; }
}

public class Shapes {
  private static void rotate(Shape s) {
    if (!(s instanceof Circle)) {
      System.out.println(s + " rotate");
    }
  }
  public static void main(String[] args) {
    Stream.of(
      new Circle(), new Square(), new Triangle(), new Rhomboid())
      .forEach(Shapes::rotate);

  }
}