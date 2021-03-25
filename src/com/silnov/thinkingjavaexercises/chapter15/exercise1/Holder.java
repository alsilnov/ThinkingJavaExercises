package com.silnov.thinkingjavaexercises.chapter15.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.silnov.thinkingjavaexercises.chapter15.exercise1.pets.Cat;
import com.silnov.thinkingjavaexercises.chapter11.exercise32.pets.Mouse;
import com.silnov.thinkingjavaexercises.chapter11.exercise32.pets.Mutt;
import com.silnov.thinkingjavaexercises.chapter14.exercise15.pets.Pug;
import com.silnov.thinkingjavaexercises.chapter15.exercise1.pets.*;

public class Holder<T> {
    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        List<Holder> petsholderList = new ArrayList<>(Arrays.asList(
            new Holder<Cat>(new Cat()),
            new Holder<Mutt>(new Mutt()),
            new Holder<Mouse>(new Mouse()),
            new Holder<Pug>(new Pug()),
            new Holder<Rat>(new Rat()),
            new Holder<Dog>(new Dog())
            ));
            for (Holder holder : petsholderList) {
                System.out.println(holder.getA());
            }
    }
}
