package com.silnov.thinkingjavaexercises.exercise17;

import java.util.*;

public class Gerbil {
  private int gerbilNumber;
  Gerbil(int gerbilNumber) {
    this.gerbilNumber = gerbilNumber;
  }
  void hop() {
    System.out.println("Number: " + gerbilNumber);
  }
  public static void main(String[] args) {
    Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
    for(int i = 0; i < 10; ++i) {
      gerbils.put(Integer.toString(i), new Gerbil(i));
    }
    Iterator<String> it = gerbils.keySet().iterator();
    while(it.hasNext()) {
      String key = it.next();
      System.out.print("Key : " + key + "; hop() : ");
      gerbils.get(key).hop();
    }
  }
}