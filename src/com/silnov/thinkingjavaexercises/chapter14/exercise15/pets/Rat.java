// typeinfo/pets/Rat.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.silnov.thinkingjavaexercises.chapter14.exercise15.pets;

public class Rat extends Rodent {
    public Rat(String name) {
        super(name);
    }

    public Rat() {
        super();
    }

    public static class Factory implements com.silnov.thinkingjavaexercises.chapter14.exercise15.Factory<Rat> {
        public Rat create() {
            return new Rat();
        }
    }
}
