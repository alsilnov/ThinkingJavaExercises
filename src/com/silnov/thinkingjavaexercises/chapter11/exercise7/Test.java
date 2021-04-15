package com.silnov.thinkingjavaexercises.chapter11.exercise7;

import java.util.*;

class Dog {
    static int counter = 0;
    private int id = counter++;

    @Override
    public String toString() {
        return "Dog " + id;
    }
}

public class Test {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[10];
        for (int i = 0; i < dogs.length; ++i) {
            dogs[i] = new Dog();
        }
        System.out.println(Arrays.toString(dogs));

        List<Dog> dogsList = new ArrayList<Dog>();
        Collections.addAll(dogsList, dogs);
        System.out.println(dogsList);

        List<Dog> dogsSubList = dogsList.subList(3, 8);
        System.out.println(dogsSubList);

        dogsList.removeAll(dogsSubList);
        System.out.println(dogsList);
    }
}