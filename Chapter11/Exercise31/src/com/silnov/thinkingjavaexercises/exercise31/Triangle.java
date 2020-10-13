package com.silnov.thinkingjavaexercises.exercise31;
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }
    @Override
    public void msgOverriden() {
        System.out.println("Triangle.msgOverriden()");
    }
    
    private String name = "Triangle";
	public String toString() {
		return this.name;
	}
}