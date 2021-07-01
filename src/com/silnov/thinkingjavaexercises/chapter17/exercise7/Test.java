package com.silnov.thinkingjavaexercises.chapter17.exercise7;

import java.util.*;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>(Countries.names(25));
        List<String> ll = new LinkedList<String>(Countries.names(25));
        System.out.println(al);
        System.out.println(ll);
        Iterator<String> alit = al.iterator();
        Iterator<String> llit = ll.iterator();
        while (alit.hasNext()) {
            System.out.print(alit.next() + (alit.hasNext() ? ", " : ""));
        }
        System.out.println();
        while (llit.hasNext()) {
            System.out.print(llit.next() + (llit.hasNext() ? ", " : ""));
        }
        System.out.println();
        System.out.println();
        ListIterator<String> allit = al.listIterator();
        ListIterator<String> lllit = ll.listIterator();
        while (lllit.hasNext()) {
            allit.add((String) lllit.next());
            allit.next();
        }
        System.out.println(al);
        System.out.println();
        List<String> al2 = new ArrayList<String>(Countries.names(25));
        ListIterator<String> allit2 = al2.listIterator();
        while (lllit.hasPrevious()) {
            lllit.previous();
        }
        while (allit2.hasNext()) {
            allit2.next();
        }
        while (lllit.hasNext()) {
            allit2.add((String) lllit.next());
            allit2.previous();
            allit2.previous();
        }
        System.out.println(al2);
    }
}