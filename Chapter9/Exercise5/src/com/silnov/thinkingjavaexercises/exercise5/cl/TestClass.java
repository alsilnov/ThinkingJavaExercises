package com.silnov.thinkingjavaexercises.exercise5.cl;
import com.silnov.thinkingjavaexercises.exercise5.inter.TestInterface;

public class TestClass implements TestInterface {
    public void foo() {
        System.out.println("foo()");;
    }
    public void bar() {
        System.out.println("bar()");;
    }
    public void xin() {
        System.out.println("xin()");;
    }
    public static void main(String[] args) {
        //(new TestClass()).foo();
        (new TestClass()).bar();
        (new TestClass()).xin();
    }
}