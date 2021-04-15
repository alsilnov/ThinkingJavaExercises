package com.silnov.thinkingjavaexercises.chapter12.exercise23;

class Dis {
    void dispose() {
    }
}

class FallingConstructor {
    Dis d1;
    Dis d2;

    FallingConstructor() throws Exception {
        try {
            this.d1 = new Dis();
            try {
                this.d2 = new Dis();
            } catch (Exception e) {
                System.out.println("Failed to create d2");
            }
        } catch (Exception e) {
            System.out.println("Failed to create d1");
        } finally {
            d1.dispose();
            System.out.println("d1.dispose()");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        try {
            FallingConstructor test = new FallingConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}