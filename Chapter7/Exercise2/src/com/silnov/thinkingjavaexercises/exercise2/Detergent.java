package com.silnov.thinkingjavaexercises.exercise2;
public class Detergent {
    private String str = "Detergent";
    public void append(String str) {
        this.str += str;
    }
    public void scrub() {
        append(" scrub()");
    } 
}