package com.silnov.thinkingjavaexercises.chapter10.exercise20;

interface TestInterface {
    void testInterfacemethod();
    class Test implements TestInterface {
        @Override
        public void testInterfacemethod() {
            System.out.println("Test");
        }
        public static void main(String[] args) {
            TestInterface test = new Test();
            test.testInterfacemethod();
        }
    }
}


 
