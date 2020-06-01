package com.silnov.thinkingjavaexercises.exercise3;
abstract class Super {
    Super() {
        print();
    }
    abstract void print();
}
class Sub extends Super {
    long i = 5;
    void print() {
        System.out.println(i);
    }
}
public class Test {
    public static void main(String[] args) {
        Sub test = new Sub();
        test.print();
    }
}