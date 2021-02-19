package com.silnov.thinkingjavaexercises.chapter12.exercise18;

class VeryImportantException extends Exception {
  @Override
  public String toString() {
    return "A very important exception!";
  }
}

class HoHumException extends Exception {
  @Override
  public String toString() {
    return "A trivial exception";
  }
}
class MoreHoHumException extends Exception {
  @Override
  public String toString() {
    return "A more trivial exception";
  }
}

public class LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dispose() throws HoHumException {
    throw new HoHumException();
  }
  void g() throws MoreHoHumException {
    throw new MoreHoHumException();
  }
  public static void main(String[] args) {
    try {
      try {
        LostMessage lm = new LostMessage();
        try {
          lm.f();
          lm.dispose();
        } finally {
          lm.g();
        }
      } catch(VeryImportantException |
              HoHumException e) {
        System.out.println(e);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}