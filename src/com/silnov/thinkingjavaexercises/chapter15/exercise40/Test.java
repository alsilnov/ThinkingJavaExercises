package com.silnov.thinkingjavaexercises.chapter15.exercise40;

import java.lang.reflect.Method;
import java.util.*;
import com.silnov.thinkingjavaexercises.chapter15.exercise40.pets.*;

public class Test {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq)
                f.invoke(t, args);
        } catch (Exception e) {
            // Failures are programmer errors
            throw new RuntimeException(e);
        }
    }
}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++)
                // Assumes default constructor:
                add(type.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest40 {
    public static void main(String[] args) throws Exception {
        // Random list of 10 pets:
        List<Pet> pets = new PetCreator().list(10);
        System.out.print("Random pets: " + pets);
        // Applies the overridden methods:
        Test.apply(pets, Pet.class.getMethod("speak"));
        // FilledList contains only one type:
        Test.apply(new FilledList<Pet>(Dog.class, 5), Pet.class.getMethod("speak"));
    }
}