package com.silnov.thinkingjavaexercises.exercise7;
class C extends A {
    B i = new B(1);
    //static B k = new B(1);
    C() {
      super(1);
      System.out.println("Constructor C()");  
    }
    public static void main(String[] args) {
        C test = new C();
    }
}