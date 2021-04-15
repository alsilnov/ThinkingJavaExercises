// onjava/Tuple5.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.silnov.thinkingjavaexercises.chapter15.exercise3;

public class Tuple6<A, B, C, D, E, F> extends Tuple5<A, B, C, D, E> {
    public final F a6;

    public Tuple6(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        a6 = f;
    }

    @Override
    public String rep() {
        return super.rep() + ", " + a6;
    }
}
