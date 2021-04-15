package com.silnov.thinkingjavaexercises.chapter8.exercise4;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void msgOverriden() {
        System.out.println("Circle.msgOverriden()");
    }

    private String name = "Circle";

    public String toString() {
        return this.name;
    }
}