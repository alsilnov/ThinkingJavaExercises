package com.silnov.thinkingjavaexercises.chapter7.exercise1.simpleclass;

public class SimpleClass {
    private String str;

    public String toString() {
        if (str == null) {
            str = "sipmle class instance";
        }
        return str;
    }
}