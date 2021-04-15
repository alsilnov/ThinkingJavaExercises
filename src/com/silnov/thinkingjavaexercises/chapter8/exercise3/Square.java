package com.silnov.thinkingjavaexercises.chapter8.exercise3;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void msgOverriden() {
        System.out.println("Square.msgOverriden()");
    }

    private String name = "Square";

    public String toString() {
        return this.name;
    }
}