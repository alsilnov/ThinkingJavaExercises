package com.silnov.thinkingjavaexercises.chapter8.exercise7;

enum Note {
    MIDDLE_C, C_CHARP, B_FLAT;
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

public class Music7 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
                new Saxophone() };
        tuneAll(orchestra);
        for (Instrument i : orchestra) {
            System.out.println(i);
        }
    }
}