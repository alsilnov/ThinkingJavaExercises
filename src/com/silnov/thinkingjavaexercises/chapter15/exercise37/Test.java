package com.silnov.thinkingjavaexercises.chapter15.exercise37;

import java.util.*;

interface TimeStamped {
    long getStamp();
}

class TimeStampedImp implements TimeStamped {
    private final long timeStamp;

    TimeStampedImp() {
        timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered {
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}

interface Colored {
    String getColor();
}

class ColoredImp implements Colored {

    private String color = "blue";

    public void setColor(String col) {
        color = col;
    }

    @Override
    public String getColor() {
        return color;
    }
}

interface Basic {
    void set(String val);

    String get();
}

class BasicImp implements Basic {
    private String value;

    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        return value;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered, Colored {
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber = new SerialNumberedImp();
    private Colored color = new ColoredImp();

    @Override
    public String getColor() {
        return color.getColor();
    }

    @Override
    public long getStamp() {
        return timeStamp.getStamp();
    }

    @Override
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
}

public class Test {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin(), mixin3 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        mixin3.set("test string 3");
        System.out.println(
                mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber() + " " + mixin1.getColor());
        System.out.println(
                mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber() + " " + mixin2.getColor());
        System.out.println(
                mixin3.get() + " " + mixin3.getStamp() + " " + mixin3.getSerialNumber() + " " + mixin3.getColor());
    }
}