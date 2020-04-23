package com.silnov.thinkingjavaexercises.exercise20;

class Ancestor {
  private void printClassName() {
    System.out.println("Class Ancestor");
  }
}
public class Test extends Ancestor {
  @Override // wont compile because in Ancestor this method is private and we dont see it 
  public void printClassName() {
    System.out.println("Class Test");
  }
  public static void main(String[] args) {
    Test test = new Test();
    test.printClassName();
  }
}