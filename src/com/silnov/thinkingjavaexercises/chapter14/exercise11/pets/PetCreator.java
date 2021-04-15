// typeinfo/pets/PetCreator.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Creates random sequences of Pets
package com.silnov.thinkingjavaexercises.chapter14.exercise11.pets;

import java.util.*;
import java.util.function.*;
import java.lang.reflect.InvocationTargetException;

public abstract class PetCreator {
    private Random rand = new Random(113);

    // The List of the different types of Pet to create:
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet() { // Create one random Pet
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
