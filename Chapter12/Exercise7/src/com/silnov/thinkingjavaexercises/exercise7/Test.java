package com.silnov.thinkingjavaexercises.exercise7;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;
public class Test {
    private static Logger logger = Logger.getLogger("ExeptionOne");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
      String[] str = {"0"};
      try {
        System.out.println(str[1]);
      } catch (Exception e) {
        System.err.println("Caught ArrayIndexOutOfBoundsException");
        e.printStackTrace();
        logException(e);
      }
    }
  }