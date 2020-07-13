package com.silnov.thinkingjavaexercises.exercise10;
enum Note {
    MIDDLE_C, C_CHARP, B_FLAT;
}
interface Instrument {
	public String toString();
    public void  adjust();
}
interface Playable {
    public void play(Note n);
}
class Wind implements Instrument, Playable {
	public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
	public String toString() {
        return "Wind";
    }
	public void adjust() {
        System.out.println("Adjusting Wind");
    }
}
class Percussion implements Instrument, Playable {
	public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
	public String toString() {
        return "Percussion";
    }
	public void adjust() {
        System.out.println("Adjusting Percussion");
    } 
}

class Stringed implements Instrument, Playable {
	public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
	public String toString() {
        return "Stringed";
    }
	public void adjust() {
        System.out.println("Adjusting Stringed");
    } 
}

class Brass extends Wind {
	public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
	public String toString() {
        return "Brass";
    }
	public void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
	public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
	public String toString() {
        return "Woodwind";
    }
}
public class Music {
    public static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Playable[] e) {
		for(Playable i : e)
			tune(i);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}