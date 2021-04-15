package com.silnov.thinkingjavaexercises.chapter8.exercise12;

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

enum Color {
    RED, GREEN, GREY, BROWN;
}

class Rat extends Rodent {
    private String name = "Rat";
    private Color color = Color.GREY;

    public Rat() {
        System.out.println("Rat()");
    }

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

    public void getColor() {
        System.out.println(color);
    }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    private Color color = Color.GREY;

    public Mouse() {
        System.out.println("Mouse()");
    }

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

    public void getColor() {
        System.out.println(color);
    }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    private Color color = Color.BROWN;

    public Squirrel() {
        System.out.println("Squirrel()");
    }

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

    public void getColor() {
        System.out.println(color);
    }
}

public class Rodent {
    private String name = "Rodent";
    private Color color = null;

    public Rodent() {
        System.out.println("Rodent()");
    }

    public void eat() {
        System.out.println("Rodent.eat()");
    }

    public void sleep() {
        System.out.println("Rodent.sleep()");
    }

    public void run() {
        System.out.println("Rodent.run()");
    }

    public void getColor() {
        System.out.println(color);
    }

    public String toString() {
        return name;
    }

    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for (int i = 0; i < 10; ++i) {
            rodents[i] = gen.next();
        }
        for (Rodent i : rodents) {
            i = gen.next();
            System.out.println(i);
            i.getColor();
            i.run();
            i.eat();
            i.sleep();
            System.out.println("---------------------");
        }
    }
}