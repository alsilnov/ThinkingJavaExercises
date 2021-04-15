package com.silnov.thinkingjavaexercises.exercise21;

class Ancestor {
    final void printClassName() {
        System.out.println("Class Ancestor");
    }
}

public class Test extends Ancestor {
    @Override // wont compile because printClassName() in Test cannot override
              // printClassName() in Ancestor, overridden method is final
    public void printClassName() {
        System.out.println("Class Test");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.printClassName();
    }
}