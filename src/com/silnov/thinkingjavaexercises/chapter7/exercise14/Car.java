package com.silnov.thinkingjavaexercises.chapter7.exercise14;

class Engine {
    public void service() {
        System.out.println("service()");
    }
}

public class Car {
    private Engine engine = new Engine();

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.service();
    }
}
