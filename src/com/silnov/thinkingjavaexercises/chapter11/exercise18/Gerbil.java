package com.silnov.thinkingjavaexercises.chapter11.exercise18;

import java.util.*;

public class Gerbil {
  private int gerbilNumber;
  Gerbil(int gerbilNumber) {
    this.gerbilNumber = gerbilNumber;
  }
  void hop() {
    System.out.println("Number: " + gerbilNumber);
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return Integer.toString(gerbilNumber);
  }
  public static void main(String[] args) {
    Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
    gerbils.put("Fuzzy", new Gerbil(0));
		gerbils.put("Spot", new Gerbil(1));
		gerbils.put("Speedy", new Gerbil(2));
		gerbils.put("Dopey", new Gerbil(3));
		gerbils.put("Sleepy", new Gerbil(4));
		gerbils.put("Happy", new Gerbil(5));
		gerbils.put("Funny", new Gerbil(6));
		gerbils.put("Silly", new Gerbil(7));
		gerbils.put("Goofy", new Gerbil(8));
		gerbils.put("Wowee", new Gerbil(9));
    System.out.println(gerbils);
    Map<String, Gerbil> gerbilsList = new LinkedHashMap<String, Gerbil>();
    Set<String> keySet = new TreeSet<String>(gerbils.keySet());
    for (String str : keySet) {
      gerbilsList.put(str, gerbils.get(str));
    }
    System.out.println(gerbilsList);
  }
}