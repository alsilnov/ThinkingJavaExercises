package com.silnov.thinkingjavaexercises.exercise8;

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
    ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
    for(int i = 0; i < 10; ++i) {
      gerbils.add(new Gerbil(i));
    }
    Iterator<Gerbil> it = gerbils.iterator();
    while(it.hasNext()) {
      it.next().hop();
    }
  }
}