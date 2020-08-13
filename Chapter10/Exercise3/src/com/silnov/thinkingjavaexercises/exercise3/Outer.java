package com.silnov.thinkingjavaexercises.exercise3;


public  class Outer {
    private String word; 
    Outer(String word) {
        this.word = word;
    }
    class  Inner {
        Inner() {
            System.out.println("new Inner()");
        }
        @Override
        public String toString() {
            return word;
        }
    }
    Inner getInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer out = new Outer("My word");
        Inner in = out.getInner();
        System.out.println(in);
    }
}