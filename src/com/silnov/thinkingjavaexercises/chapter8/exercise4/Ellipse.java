package com.silnov.thinkingjavaexercises.chapter8.exercise4;

public class Ellipse extends Shape {
    @Override
    public void draw() {
        System.out.println("Ellipse.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Ellipse.erase()");
    }

    @Override
    public void msgOverriden() {
        System.out.println("Ellipse.msgOverriden()");
    }

    private String name = "Ellipse";

    public String toString() {
        return this.name;
    }
}