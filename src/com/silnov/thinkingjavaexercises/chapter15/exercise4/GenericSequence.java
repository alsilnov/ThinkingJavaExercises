
// innerclasses/Sequence.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Holds a sequence of Objects
package com.silnov.thinkingjavaexercises.chapter15.exercise4;

import java.util.ArrayList;
import java.util.List;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class GenericSequence<T> {
    private List<T> list = new ArrayList<>();
    private int next = 0;

    public GenericSequence(List<T> list) {
        this.list = list;
    }

    public void add(T t) {
        list.add(t);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == list.size();
        }

        @Override
        public Object current() {
            return list.get(i);
        }

        @Override
        public void next() {
            if (i < list.size()) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        GenericSequence<String> sequence = new GenericSequence<>(new ArrayList<String>());
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}