package com.silnov.thinkingjavaexercises.chapter15.exercise27;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // compile error: incompatible types:
        // List<Number> lnum = new ArrayList<Integer>();
        List<? extends Number> nlist = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        // compile error: can't add Integer:
        // nlist.add(new Integer(0));
        nlist.add(null); // can add null
        Number x = nlist.get(2); // can get Number (null)
        System.out.println(nlist);
    }
}