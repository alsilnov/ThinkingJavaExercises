package com.silnov.thinkingjavaexercises.chapter11.exercise11;

import java.util.*;
import java.text.SimpleDateFormat;

public class Test {
    static void method(Collection col) {
        Iterator it = col.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
    ArrayList<Integer> al = 
        new ArrayList<Integer>(Arrays.asList(1, 2, 3));
    LinkedList<Character> ll =
        new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));	
    HashSet<Float> hs = 
        new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
    TreeSet<Double> ts =
        new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
    LinkedHashSet<Integer> lhs =
        new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
    method(al);
    method(ll);
    method(hs);
    method(ts);
    method(lhs);
    }
}