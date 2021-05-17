package com.silnov.thinkingjavaexercises.chapter16.exercise13;

public class Test {
    public static void main(String[] args) {
        char[] ch = new char[10];
        CountingGenerator.Character cGen = new CountingGenerator.Character();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = cGen.next();
        }
        System.out.println(new String(ch));
    }
}