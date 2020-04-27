package com.silnov.thinkingjavaexercises.exercise4;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class RandomShapeGenerator {
    private Date dateNow = new Date();
    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("S");
    private Random rand = new Random(Long.parseLong(formatForDateNow.format(dateNow)));
    public Shape next() {

        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Ellipse();
        }
    }
}