package com.silnov.thinkingjavaexercises.chapter11.exercise21;

import java.util.*;
import java.nio.file.*;

/**
 * Test
 */
public class Test {

  public static void main(String[] args) throws Exception {

    System.out.println(Paths.get("The Canterville Ghost.txt"));
    List<String> lines = Files.readAllLines(Paths.get("/ShareFromWin/Code/Java/ThinkingJavaExercises/Chapter11/Exercise16/src/com/silnov/thinkingjavaexercises/exercise16/The Canterville Ghost.txt"));
    Map<String, Integer> words = new TreeMap<String, Integer>();
    
    for(String line : lines) {
      for(String word : line.split("\\W+")) {
        if(word.trim().length() > 0) {
          word = word.toLowerCase();
          if (word.matches("^\\D*$")) {
            Integer freq = words.get(word);
            words.put(word, freq == null ? 1 : freq + 1);
          }
        }
      }
    }
    System.out.println(words);
  }
}