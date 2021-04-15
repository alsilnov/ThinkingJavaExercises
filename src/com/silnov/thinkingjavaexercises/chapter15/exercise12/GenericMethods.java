package com.silnov.thinkingjavaexercises.chapter15.exercise12;

import java.util.*;

class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> arrayList() {
        return new ArrayList<T>();
    }

    public static <T> List<T> linkedList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }
}

class A {
    public String toString() {
        return "A";
    }
}

class B {
    public String toString() {
        return "B";
    }
}

class C extends B {
    public String toString() {
        return "C";
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        List<C> lc = New.<C>arrayList();
        lc.add(new C());

        Map<A, List<? extends B>> mab = New.<A, List<? extends B>>map();
        mab.put(a, lc);

        List<B> llb = New.<B>linkedList();
        llb.add(new B());

        Set<A> sa = New.<A>set();
        sa.add(new A());

        Queue<B> qb = New.<B>queue();
        qb.add(new B());

        System.out.println(lc);
        System.out.println(mab);
        System.out.println(llb);
        System.out.println(sa);
        System.out.println(qb);
    }
}