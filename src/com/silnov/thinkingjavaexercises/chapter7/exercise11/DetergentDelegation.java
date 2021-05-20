package com.silnov.thinkingjavaexercises.chapter7.exercise11;

class Cleanser {
    private String str = "Cleanser";

    public void append(String str) {
        this.str += str;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

public class DetergentDelegation {

    private Cleanser cleanser = new Cleanser();

    public void append(String str) {
        cleanser.append(str);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append(" Detergent.scrub()");
    }

    public void foam() {
        append(" foam()");
    }

    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.main(args);
    }
}
