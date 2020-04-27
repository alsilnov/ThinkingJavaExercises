package com.silnov.thinkingjavaexercises.exercise4;

public class Shape {
    public void draw() {}
    public void erase() {}
    public void msgOverriden() {
        System.out.println("Shape.msgOverriden()");
    }
    public void msgNotOverriden() {
        System.out.println("Shape.msgNotOverriden()");
    }
    public void msgThis() {
        System.out.println(this);
    }
}