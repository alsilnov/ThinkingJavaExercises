package com.silnov.thinkingjavaexercises.exercise9;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

class RandomRodentGenerator {
    private Date dateNow = new Date();
    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("S");
    private Random rand = new Random(Long.parseLong(formatForDateNow.format(dateNow)));
    public Rodent next() {

        switch(rand.nextInt(3)) {
            default:
            case 0: return new Rat();
            case 1: return new Mouse();
            case 2: return new Squirrel();
        }
    }
}


class Rat extends Rodent {
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
class Mouse extends Rodent {
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
class Squirrel extends Rodent {
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
public class Rodent {
    private String name = "Rodent";
    public void eat() {
        System.out.println("Rodent.eat()");
    }
    public void sleep() {
        System.out.println("Rodent.sleep()");
    }
    public void run() {
        System.out.println("Rodent.run()");
    }
	public String toString() {
        return name;
    }
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[10];
        for(int i = 0; i < 10; ++i) {
            rodents[i] = gen.next();
        }
        for(Rodent i : rodents) {
            i = gen.next();
            System.out.println(i);
            i.run();
            i.eat();
            i.sleep();
        }
    }
}