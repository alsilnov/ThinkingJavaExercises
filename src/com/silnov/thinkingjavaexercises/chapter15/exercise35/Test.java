package com.silnov.thinkingjavaexercises.chapter15.exercise35;

import com.silnov.thinkingjavaexercises.chapter15.exercise35.coffee.*;
import java.util.*;

public class Test {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyMocha) {
        probablyMocha.add(new Breve());
    }

    public static void main(String[] args) {
        List<Mocha> mocha1 = new ArrayList<Mocha>();
        oldStyleMethod(mocha1); // Quietly accepts a Breve
        List<Mocha> mocha2 = Collections.checkedList(new ArrayList<Mocha>(), Mocha.class);
        try {
            oldStyleMethod(mocha2); // Throws an exception
        } catch (Exception e) {
            System.out.println(e);
            System.out.println();
        }
        // Derived type works fine:
        List<Coffee> coffee = Collections.checkedList(new ArrayList<Coffee>(), Coffee.class);
        coffee.add(new Mocha());
        coffee.add(new Breve());
    }
}