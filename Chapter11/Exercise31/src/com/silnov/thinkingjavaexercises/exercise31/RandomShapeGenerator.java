package com.silnov.thinkingjavaexercises.exercise31;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape> {
    private int size = 0;
    private Shape[] shapes;
    private Random rand = new Random();
    RandomShapeGenerator(int size) {
        this.size = size;
        this.shapes = new Shape[size];
        for(int i = 0; i < size; ++i) {
            switch (rand.nextInt(3)) {
                default:
                case 0:
                    shapes[i] = new Circle();
                    break;
                case 1:
                    shapes[i] = new Square();
                    break;
                case 2:
                    shapes[i] = new Triangle();
                    break;
            }
        }
    }
    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext() {
                return index < shapes.length;
            }
            public Shape next() {
                return shapes[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}