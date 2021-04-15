package com.silnov.thinkingjavaexercises.chapter10.exercise4;

class Word {
    String word;

    Word(String word) {
        this.word = word;
    }

    public String toString() {
        return word;
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    @Override
    public String toString() {
        return "Sequence";
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) {
                i++;
            }
        }

        public Sequence outer() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence(10);
        Selector sel = seq.selector();
        for (int i = 0; i < 10; ++i) {
            seq.add(new Word(Integer.toString(i)));
        }
        System.out.println(((SequenceSelector) sel).outer());
        while (!sel.end()) {
            System.out.println(sel.current());
            sel.next();
        }
    }
}