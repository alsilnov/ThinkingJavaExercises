package com.silnov.thinkingjavaexercises.chapter14.exercise19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.*;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface Plastic {
}

class Toy {
    // Comment out the following no-arg
    // constructor to see NoSuchMethodError
    Toy() {
    }

    Toy(int i) {
        System.out.println("Toy(" + i + ")");
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Plastic {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
        System.out.println();
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.silnov.thinkingjavaexercises.chapter14.exercise19.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires no-arg constructor:
            obj = up.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate");
        }
        printInfo(obj.getClass());

        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
            // catch four exceptions:
        } catch (NoSuchMethodException e) {
            System.out.println("No such method: " + e);
        } catch (InstantiationException e) {
            System.out.println("Unable make Toy: " + e);
        } catch (IllegalAccessException e) {
            System.out.println("Unable access: " + e);
        } catch (InvocationTargetException e) {
            System.out.println("Target invocation problem: " + e);
        }
    }
}