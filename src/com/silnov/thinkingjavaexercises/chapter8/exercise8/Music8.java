package com.silnov.thinkingjavaexercises.chapter8.exercise8;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

class RandomInstrumentGenerator {
    private Date dateNow = new Date();
    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("S");
    private Random rand = new Random(Long.parseLong(formatForDateNow.format(dateNow)));

    public Instrument next() {

        switch (rand.nextInt(6)) {
        default:
        case 0:
            return new Wind();
        case 1:
            return new Percussion();
        case 2:
            return new Stringed();
        case 3:
            return new Brass();
        case 4:
            return new Saxophone();
        case 5:
            return new Woodwind();

        }
    }
}

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    public String toString() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public String toString() {
        return "Brass";
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Saxophone extends Brass {
    void play(Note n) {
        System.out.println("Saxophone.play() " + n);
    }

    public String toString() {
        return "Saxophone";
    }

    void adjust() {
        System.out.println("Adjusting Saxophone");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}

public class Music8 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[10];
        for (int i = 0; i < 10; ++i) {
            orchestra[i] = gen.next();
        }
        tuneAll(orchestra);
        for (Instrument i : orchestra) {
            System.out.println(i);
        }
    }
}