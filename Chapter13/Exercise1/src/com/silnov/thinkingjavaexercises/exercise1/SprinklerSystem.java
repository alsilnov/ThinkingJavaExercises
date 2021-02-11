package com.silnov.thinkingjavaexercises.exercise1;
import java.util.*;
class WaterSource {
  private String s;
  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  @Override public String toString() { return s; }
}

public class SprinklerSystem {
  private String valve1, valve2, valve3, valve4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  @Override public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("valve1 = ");
    result.append(valve1);
    result.append(" valve2 = ");
    result.append(valve2);
    result.append(" valve3 = ");
    result.append(valve3);
    result.append(" valve4 = ");
    result.append(valve4);
    result.append("\ni = ");
    result.append(i);
    result.append(" f = ");
    result.append(f);
    result.append(" source = ");
    result.append(source);
    return result.toString();
    
    /*return
      "valve1 = " + valve1 + " " +
      "valve2 = " + valve2 + " " +
      "valve3 = " + valve3 + " " +
      "valve4 = " + valve4 + "\n" +
      "i = " + i + " " + "f = " + f + " " +
      "source = " + source;                      // [1]*/
  }
  public static void main(String[] args) {
    SprinklerSystem sprinklers = new SprinklerSystem();
    System.out.println(sprinklers);
  }
}