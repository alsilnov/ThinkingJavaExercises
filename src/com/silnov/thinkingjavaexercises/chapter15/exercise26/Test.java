package com.silnov.thinkingjavaexercises.chapter15.exercise26;

public class Test {
    public static void main(String[] args) {

        Number[] nb = new Number[3];
        nb[0] = new Integer(0);
        nb[1] = new Integer(1);
        nb[2] = new Integer(2);
        System.out.println(nb.getClass().getSimpleName());
        for (Number n : nb)
            System.out.println(n.getClass().getSimpleName());
    }
}