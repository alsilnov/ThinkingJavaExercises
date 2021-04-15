package com.silnov.thinkingjavaexercises.chapter12.exercise3;

public class Test {
    public static void main(String[] args) {
        String[] str = { "0" };
        try {
            System.out.println(str[1]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}