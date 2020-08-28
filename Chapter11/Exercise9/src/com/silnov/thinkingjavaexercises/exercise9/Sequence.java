package com.silnov.thinkingjavaexercises.exercise9;

import java.util.*;
class Word {
    String word;
    Word(String word) {
        this.word = word;
    }
    public String toString() {
        return word;
    }
}
public  class Sequence  {
    private List<Object> items = new ArrayList<Object>();
	public void add(Object x) {
        items.add(x);
    }
    Iterator iterator() {
        return items.iterator();
    }
    public static void main(String[] args) {
        Sequence seq = new Sequence();
        for(int i = 0; i < 10; ++i) {
            seq.add(new Word(Integer.toString(i)));
        }
        Iterator it  = seq.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}