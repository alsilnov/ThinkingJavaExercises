package com.silnov.thinkingjavaexercises.exercise22;

import java.util.*;
import java.nio.file.*;
class Word {
  String str;
  Integer count;
  Word(String str, Integer count) {
    this.str = str;
    this.count = count;
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return str + " : " + count;
  }
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    return this.str.equals(((Word)obj).str);
  }
  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return str.length();
  }
}
/**
 * Test
 */
public class Test {
  public static void main(String[] args) throws Exception {
    System.out.println(Paths.get("The Canterville Ghost.txt"));
    List<String> lines = Files.readAllLines(Paths.get("/ShareFromWin/Code/Java/ThinkingJavaExercises/Chapter11/Exercise16/src/com/silnov/thinkingjavaexercises/exercise16/The Canterville Ghost.txt"));
    //Map<String, Integer> words = new TreeMap<String, Integer>();
    List<String> words = new ArrayList<String>();
    
    for(String line : lines) {
      for(String word : line.split("\\W+")) {
        if(word.trim().length() > 0) {
          word = word.toLowerCase();
          if (word.matches("^\\D*$") && word.length() > 2) {
            words.add(word);
           // words.add(word, freq == null ? 1 : freq + 1);
          }
        }
      }
    }
    Set<Word> wordObjects = new LinkedHashSet<Word>();
    Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
    Iterator it = words.iterator();	
    while(it.hasNext()) {
      String s = (String)it.next();
      int count = 0;			
      for(int i = 0; i < words.size(); i++) {
        if(s.equals(words.get(i))) {
          count++;
          //words.remove(i);
        }
      }
      Word w = new Word(s, count);
      wordObjects.add(w);
    }
    System.out.println(wordObjects);
  }
}