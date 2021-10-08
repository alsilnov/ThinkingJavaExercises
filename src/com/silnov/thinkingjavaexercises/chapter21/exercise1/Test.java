package com.silnov.thinkingjavaexercises.chapter21.exercise1;

public class Test implements Runnable {
private String name;

    public Test(String name) {
        this.name = name;
        System.out.println("constructor" + name);
    }
    public static void main(String[] args) {
        Thread a = new Thread(new Test("a"));
        Thread b = new Thread(new Test("b"));
        Thread c = new Thread(new Test("c"));

        a.start();
        b.start();
        c.start();

    }

    @Override
    public void run() {
        System.out.println("start" + name);
        long i = 3;
        while (i > 0) {
            System.out.println(i);
            i--;
            Thread.yield();
        }
        System.out.println("stop" + name);
    }
}
