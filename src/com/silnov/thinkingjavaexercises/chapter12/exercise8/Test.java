package com.silnov.thinkingjavaexercises.chapter12.exercise8;

class Ex extends Exception {
    private String str;

    Ex(String str) {
        this.str = str;
    }

    public void printMsg() {
        System.out.println(str);
    }

}

public class Test {
    void f() throws Ex {
        System.out.println("from f()");
        throw new Ex("Ouch from f()");
    }

    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.f();
        } catch (Ex e) {
            e.printStackTrace();
            e.printMsg();
        }
    }
}