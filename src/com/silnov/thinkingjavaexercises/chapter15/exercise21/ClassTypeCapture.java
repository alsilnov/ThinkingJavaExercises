package com.silnov.thinkingjavaexercises.chapter15.exercise21;

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

public class ClassTypeCapture {
    Map<String, Class<?>> m = new HashMap<>();

    void addType(String typename, Class<?> kind) {
        m.put(typename, kind);
    }

    Object createNew(String typename) {
        try {
            if (m.containsKey(typename))
                return m.get(typename).newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            System.out.println(typename + " class not available");
        }
        return null;
    }

    public static void main(String[] args) {

        ClassTypeCapture ct = new ClassTypeCapture();
        ct.addType("House", House.class);
        ct.addType("Building", Building.class);

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
        ct.createNew("String"); // String class not available
    }
}