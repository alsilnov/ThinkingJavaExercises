package com.silnov.thinkingjavaexercises.chapter5.exercise6;

class Dog {
    void bark(double k, int i) {
        System.out.println("Лай");
    }

    void bark(int i, double k) {
        System.out.println("Вой");
    }

    public static void main(String[] args) {
        Dog test = new Dog();
        test.bark(1f, 1);
        test.bark(1, 3f);

    }
}
