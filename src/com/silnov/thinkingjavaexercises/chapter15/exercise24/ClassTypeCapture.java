package com.silnov.thinkingjavaexercises.chapter15.exercise24;

import java.util.*;

class Building {
    @Override
    public String toString() {
        return "Building";
    }
}

class House extends Building {
    @Override
    public String toString() {
        return "House";
    }
}

interface FactoryI<T> {
    T create();
}

class BuildingFactory implements FactoryI<Building> {
    public Building create() {
        return new Building();
    }
}

class HouseFactory implements FactoryI<House> {
    public House create() {
        return new House();
    }
}

public class ClassTypeCapture {
    Map<String, FactoryI> m = new HashMap<>();

    void addType(String typename, FactoryI factory) {
        m.put(typename, factory);
    }

    Object createNew(String typename) {
        if (m.containsKey(typename)) {
            return m.get(typename).create();
        }
        System.out.println(typename + " class not available");
        return null;
    }

    public static void main(String[] args) {

        ClassTypeCapture ct = new ClassTypeCapture();
        ct.addType("House", new HouseFactory());
        ct.addType("Building", new BuildingFactory());

        Building b = (Building) ct.createNew("Building");
        House h = (House) ct.createNew("House");
        System.out.print("b.getClass().getName(): ");
        System.out.println(b.getClass().getName());
        System.out.print("h.getClass().getName(): ");
        System.out.println(h.getClass().getName());
        System.out.print("House h is instance House: ");
        System.out.println(h instanceof House);
        System.out.print("House h is instance of Building: ");
        System.out.println(h instanceof Building);
        System.out.print("Building b is instance of House: ");
        System.out.println(b instanceof House);
        ct.createNew("String");
    }
}