package com.silnov.thinkingjavaexercises.chapter14.exercise6;

import java.util.*;
// typeinfo/Shapes.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

abstract class Shape {
    boolean flag = false;

    @Override
    public abstract String toString();

    void setFlag() {
        flag = true;
    }

    void resetFlag() {
        flag = false;
    }
}

class Circle extends Shape {
    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Square";
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Rhomboid";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> list = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        for (Shape shape : list) {
            if (shape instanceof Rhomboid) {
                shape.setFlag();
            }
        }
        list.forEach(System.out::println);
    }
}