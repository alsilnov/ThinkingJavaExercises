package com.silnov.thinkingjavaexercises.exercise6;
interface Inter {
    void one();
    void two();
    void three();
}
public class Test implements Inter {
    /*

"Cannot reduce the visibility of the inherited method from Inter"
    void one() {
        System.out.println("one");
    }
    protected void two() {
        System.out.println("two");
    }
    private void three() {
        System.out.println("three");
    }*/
    public void one() {
        System.out.println("one");
    }
    public void two() {
        System.out.println("two");
    }
    public void three() {
        System.out.println("three");
    }
    public static void main(String[] args) {
        Test x = new Test();
        x.one();
        x.two();
        x.three();
    }
}