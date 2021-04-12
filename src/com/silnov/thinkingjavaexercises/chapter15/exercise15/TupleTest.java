package com.silnov.thinkingjavaexercises.chapter15.exercise15;
import static com.silnov.thinkingjavaexercises.chapter15.exercise15.Tuple.*;
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<String, String, Integer> g() {
        return tuple("hi1", "hi2", 47);
    }

    static FourTuple<String, String, String, Integer> h() {
        return tuple("hi1", "hi2", "hi3", 47);
    }

    static FiveTuple<String, String, String, Integer, Double> k() {
        return tuple("hi1", "hi2", "hi3", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        // compiler warning: unchecked conversion:
        TwoTuple<String, Integer> ttsi2 = f2();
        System.out.println(ttsi2);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}