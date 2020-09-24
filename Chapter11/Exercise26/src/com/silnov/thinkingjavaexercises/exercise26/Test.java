package com.silnov.thinkingjavaexercises.exercise26;

import java.nio.file.*;
import java.util.*;
/**
 * Test
 */
public class Test {
  public static void main(String[] args) throws Exception {
    System.out.println(Paths.get("The Canterville Ghost.txt"));
    List<String> lines = Files.readAllLines(Paths.get("/ShareFromWin/Code/Java/ThinkingJavaExercises/Chapter11/Exercise16/src/com/silnov/thinkingjavaexercises/exercise16/The Canterville Ghost.txt"));
    Map<String, ArrayList<Integer>> worldPosition = new LinkedHashMap<String, ArrayList<Integer>>(); 
    int count = 0;
    for(String line : lines) {
      for(String word : line.split("\\W+")) {
        if(word.trim().length() > 0) {
          ++count;
          if (!worldPosition.keySet().contains(word)) {
            List<Integer> aList = new ArrayList<Integer>();
            aList.add(count);
            worldPosition.put(word, (ArrayList)aList);         
          } else {
            worldPosition.get(word).add(count);
            worldPosition.put(word, worldPosition.get(word));  
          }
        }
      }
    }
    //System.out.println(count);
    //System.out.println(worldPosition);
    Map<Integer, String> positionWord = new TreeMap<Integer, String>();
    Iterator<Map.Entry<String, ArrayList<Integer>>> it = worldPosition.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, ArrayList<Integer>> mapEntry = it.next();
      for (int i = 0; i < mapEntry.getValue().size(); i++) {
        positionWord.put(mapEntry.getValue().get(i), mapEntry.getKey());
      }
    }
    Iterator<Map.Entry<Integer, String>> positionWordIt = positionWord.entrySet().iterator();
    while (positionWordIt.hasNext()) {
      System.out.print(positionWordIt.next().getValue() + " ");
    }
    //System.out.println(positionWord);
  }
}