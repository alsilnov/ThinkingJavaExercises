package com.silnov.thinkingjavaexercises.chapter13.exercise7;

import java.util.*;

/**
 * Test
 */
public class Test {
    public static String str1 = "Asdasdasdasdqwdqdd.";
    public static String str2 = "asdasdasdasdqwdqdd.";

    public static void main(String[] args) {
        System.out.println(str1.matches("^[A-Z].*[\\.]$"));
        System.out.println(str2.matches("^[A-Z].*[\\.]$"));
    }

}