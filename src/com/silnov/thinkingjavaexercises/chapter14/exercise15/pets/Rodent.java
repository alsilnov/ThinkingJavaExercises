// typeinfo/pets/Rodent.java
// (c)2020 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.silnov.thinkingjavaexercises.chapter14.exercise15.pets;

public class Rodent extends Pet {
    public Rodent(String name) {
        super(name);
    }

    public Rodent() {
        super();
    }

    public static class Factory implements com.silnov.thinkingjavaexercises.chapter14.exercise15.Factory<Rodent> {
        public Rodent create() {
            return new Rodent();
        }
    }
}
