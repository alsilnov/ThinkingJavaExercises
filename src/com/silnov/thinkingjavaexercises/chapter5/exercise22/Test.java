
package com.silnov.thinkingjavaexercises.chapter5.exercise22;

class Test {
    public enum Money {
        USD, EUR, RUR, CAD, GBP, JPY
    }

    public static void main(String... args) {
        for (Money i : Money.values()) {
            switch (i) {
            case USD:
                System.out.println(i + " " + i.ordinal() + " GOOD");
                break;
            case RUR:
                System.out.println(i + " " + i.ordinal() + " BAD");
                break;
            default:
                break;
            }
        }
    }
}