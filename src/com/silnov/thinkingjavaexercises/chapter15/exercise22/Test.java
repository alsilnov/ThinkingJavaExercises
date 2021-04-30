package com.silnov.thinkingjavaexercises.chapter15.exercise22;

import java.lang.reflect.*;

class Building {
}

class House extends Building {
    private String location;
    private Integer area;
    public House(){}
    public House(String location, Integer area) {
        this.location = location;
        this.area = area;
    }

    public String toString() {
        return "House" + ((location == null) ? "" : " in " + location)
                + ((area != null) ? (", " + area + " sqft") : "");
    }
}

public class Test<T> {
    Class<T> kind;

    public Test(Class<T> kind) {
        this.kind = kind;
    }

    /** To create instance of typename with constructors taking arguments args: */
    public Object createNew(String typename, Object... args) throws IllegalAccessException, InstantiationException,
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        return kind.getConstructor(args[0].getClass(), args[1].getClass()).newInstance(args[0],
                args[1]);
    }

    public static void main(String[] args) {
        Test<House> th = new Test<House>(House.class);
        try {
            House h = (House) th.createNew("House", "Manila", 5000);
            System.out.println(h);
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException in main");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException in main");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException in main");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException in main");
        } catch (InvocationTargetException e) {
            System.out.println("InvocationTargetException in main");
        }
    }
}