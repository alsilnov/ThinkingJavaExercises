package com.silnov.thinkingjavaexercises.chapter8.exercise3;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; ++i) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            System.out.println("_____________________________\n");
            shp.msgThis();
            shp.draw();
            shp.msgNotOverriden();
            shp.msgOverriden();
        }
    }
}