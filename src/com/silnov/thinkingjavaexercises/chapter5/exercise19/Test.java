package com.silnov.thinkingjavaexercises.chapter5.exercise19;

class Test {

    public static void foo(String... array) {
        System.out.println(array.getpackage com.silnov.thinkingjavaexercises.chapter5.exercise; class());
        System.out.println(array.length);
        for (String i : array) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test.foo();
        Test.foo("str");
        Test.foo(new String[] { "str", "str1" });
    }
}