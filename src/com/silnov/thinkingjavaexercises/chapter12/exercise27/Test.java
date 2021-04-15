package com.silnov.thinkingjavaexercises.chapter12.exercise27;

import java.util.*;
import java.nio.file.*;

public class Test {
    public static void main(String[] args) {
        String[] str = { "0" };
        try {
            System.out.println(str[1]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}