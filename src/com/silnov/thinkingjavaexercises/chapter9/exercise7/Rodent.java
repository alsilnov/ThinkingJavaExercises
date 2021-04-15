package com.silnov.thinkingjavaexercises.chapter9.exercise7;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

class RandomRodentGenerator {
    private Date dateNow = new Date();
    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("S");
    private Random rand = new Random(Long.parseLong(formatForDateNow.format(dateNow)));

    public Rodent next() {

        switch (rand.nextInt(3)) {
        default:
        case 0:
            return new Rat();
        case 1:
            return new Mouse();
        case 2:
            return new Squirrel();
        }
    }
}

class Rat implements Rodent {
    private String name = "Rat";

    public void eat() {
        System.out.println("Rat.eat()");
    }

    public void sleep() {
        System.out.println("Rat.sleep()");
    }

    public void run() {
        System.out.println("Rat.run()");
    }

    public String toString() {
        return name;
    }
}

class Mouse implements Rodent {
    private String name = "Mouse";

    public void eat() {
        System.out.println("Mouse.eat()");
    }

    public void sleep() {
        System.out.println("Mouse.sleep()");
    }

    public void run() {
        System.out.println("Mouse.run()");
    }

    public String toString() {
        return name;
    }
}

class Squirrel implements Rodent {
    private String name = "Squirrel";

    public void eat() {
        System.out.println("Squirrel.eat()");
    }

    public void sleep() {
        System.out.println("Squirrel.sleep()");
    }

    public void run() {
        System.out.println("Squirrel.run()");
    }

    public String toString() {
        return name;
    }
}

interface Rodent {
    public void eat();

    public void sleep();

    public void run();

    public String toString();

    public static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < 10; ++i) {
            rodents[i] = gen.next();
        }
        for (Rodent i : rodents) {
            i = gen.next();
            System.out.println(i);
            i.run();
            i.eat();
            i.sleep();
        }
    }
}