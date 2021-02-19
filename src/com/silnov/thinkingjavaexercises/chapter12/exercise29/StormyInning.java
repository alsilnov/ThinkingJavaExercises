package com.silnov.thinkingjavaexercises.chapter12.exercise29;

class BaseballException extends Exception {}
class Foul extends RuntimeException {}
class Strike extends RuntimeException {}
abstract class Inning {
  Inning() {}
  public void event() {}
  public abstract void atBat();
  public void walk() {}
}
class StormException extends RuntimeException {}
class RainedOut extends RuntimeException {}
class PopFoul extends RuntimeException {}
interface Storm {
  void event();
  void rainHard();
}
public class StormyInning extends Inning implements Storm {
  public StormyInning() {}
  public StormyInning(String s) {}
  @Override
  public void rainHard() {}
  @Override
  public void event() {}
  @Override
  public void atBat() {
    throw new Strike();
  }
  public static void main(String[] args) {
    StormyInning si = new StormyInning();
    si.atBat();
    Inning i = new StormyInning();
    i.atBat();
  }
}