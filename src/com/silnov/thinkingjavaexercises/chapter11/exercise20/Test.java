package com.silnov.thinkingjavaexercises.chapter11.exercise20;

import java.util.*;
import java.nio.file.*;

/**
 * Test
 */
public class Test {

  public static void main(String[] args) throws Exception {
    Set<Character> vowels = new TreeSet<Character>();
    Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
    System.out.println(Paths.get("The Canterville Ghost.txt"));
    List<String> lines = Files.readAllLines(Paths.get("/ShareFromWin/Code/Java/ThinkingJavaExercises/Chapter11/Exercise16/src/com/silnov/thinkingjavaexercises/exercise16/The Canterville Ghost.txt"));
    Set<String> words = new TreeSet<>();
    Map<Character, Integer> vowelsMap = new TreeMap<Character, Integer>();
    for (Character c: vowels) {
      vowelsMap.put(c, 0);
    }
    for(String line : lines) {
      for(String word : line.split("\\W+")) {
        if(word.trim().length() > 0) {
          words.add(word);
          for(Character c : word.toCharArray()) {
            if(vowels.contains(c)) {
              vowelsMap.replace(c, vowelsMap.get(c) + 1 );
            }
          }
        }
      }
    }
    System.out.println(vowelsMap);
  }
}