package com.silnov.thinkingjavaexercises.chapter12.exercise6;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;

class ExeptionOne extends Exception {
    private static Logger logger = Logger.getLogger("ExeptionOne");
    ExeptionOne() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class ExeptionTwo extends Exception {
    private static Logger logger = Logger.getLogger("ExeptionOne");
    ExeptionTwo() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class Test {
    public static void main(String[] args) {
        try {
            throw new ExeptionOne();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            throw new ExeptionTwo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}