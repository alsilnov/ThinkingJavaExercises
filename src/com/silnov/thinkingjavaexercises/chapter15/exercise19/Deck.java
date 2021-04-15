package com.silnov.thinkingjavaexercises.chapter15.exercise19;

import java.util.*;
import java.util.function.*;

class Container {
    private final int id;

    Container(int idNumber) {
        id = idNumber;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }

    public static Supplier<Container> generator = new Supplier<Container>() {
        private Random rand = new Random(47);

        @Override
        public Container get() {
            return new Container(rand.nextInt(1000));
        }
    };
}

class Shelf extends ArrayList<Container> {
    private final int id;

    Shelf(int id, int nProducts) {
        this.id = id;
        Suppliers.fill(this, Container.generator, nProducts);
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}

class Aisle extends ArrayList<Shelf> {
    private final int id;

    Aisle(int id, int nShelves, int nProducts) {
        this.id = id;
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(i, nProducts));
        }
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}

public class Deck extends ArrayList<Aisle> {

    public Deck(int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++)
            add(new Aisle(i, nShelves, nProducts));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle a : this) {
            result.append("Aisle: ");
            result.append(a);
            result.append("\n");
            for (Shelf s : a) {
                result.append("    Shelf: ");
                result.append(s);
                result.append("\n");
                for (Container p : s) {
                    result.append("        Container: ");
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Deck(5, 4, 3));
    }
}
