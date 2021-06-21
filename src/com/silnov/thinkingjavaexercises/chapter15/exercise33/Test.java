package com.silnov.thinkingjavaexercises.chapter15.exercise33;

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    List<T> list = new ArrayList<>();

    int count() {
        return list.size();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }
}

public class Test {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        Stack<String> strings = new Stack<String>();
        for (String s : "A B C D E F G H I J".split(" ")) {
            strings.push(s);
        }
            strings.push("oops");

        for (int i = 0; i < strings.count(); i++) {
            String s = strings.pop();
            System.out.println(s + " ");
        }
    }

}