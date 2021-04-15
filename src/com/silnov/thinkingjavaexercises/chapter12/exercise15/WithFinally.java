package com.silnov.thinkingjavaexercises.chapter12.exercise15;

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}

class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}

class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f(int i) throws OnOffException1, OnOffException2 {
    }

    static Integer[] x = new Integer[1];
}

public class WithFinally {
    static Switch sw = new Switch();
    static Integer[] x = new Integer[1];

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            OnOffSwitch.f(x[0]);
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}