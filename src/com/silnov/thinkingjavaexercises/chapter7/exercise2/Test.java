package com.silnov.thinkingjavaexercises.chapter7.exercise2;

class Test extends Detergent {
    public void scrub() {
        append(" Test.scrub");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.scrub();
        test.sterilize();
        System.out.println(test);
    }
}