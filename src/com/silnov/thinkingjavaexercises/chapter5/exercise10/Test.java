package com.silnov.thinkingjavaexercises.chapter5.exercise10;

class Test {

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub

        System.out.println("x");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test = null;
        new Test();
        System.gc();
    }
}
