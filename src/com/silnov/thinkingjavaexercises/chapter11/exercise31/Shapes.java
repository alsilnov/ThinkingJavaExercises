package com.silnov.thinkingjavaexercises.chapter11.exercise31;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator(6);

    public static void main(String[] args) {
        for (Shape shp : gen) {
            System.out.println("_____________________________\n");
            shp.msgThis();
            shp.draw();
            shp.msgNotOverriden();
            shp.msgOverriden();
        }

    }
}