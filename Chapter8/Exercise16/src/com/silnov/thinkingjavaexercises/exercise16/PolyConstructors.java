package com.silnov.thinkingjavaexercises.exercise16;

class Glyph {
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");  
    }
    void draw() {
        System.out.println("Glyph.draw()");
    }
}
class SquareGlyph extends Glyph {
    private int sdie = 1;
    SquareGlyph(int s) {
        sdie = s;
        System.out.println("SquareGlyph(" + sdie + ")");  
    }
    void draw() {
        System.out.println("SquareGlyph.draw() side = " + sdie);
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph(" + radius + ")");  
    }
    void draw() {
        System.out.println("RoundGlyph.draw() radius = " + radius);
    }
}
class PolyConstructors {
    public static void main(String[] args) {
        new SquareGlyph(4);
        new RoundGlyph(5);
    }
} 
