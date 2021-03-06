// reflection/pets/Pug.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.silnov.thinkingjavaexercises.chapter15.exercise40.pets;

public class Pug extends Dog {
    public Pug(String name) {
        super(name);
    }

    public Pug() {
        super();
    }

    public void speak() {
        System.out.println("Pug speech");
    }
}
