package com.silnov.thinkingjavaexercises.chapter8.exercise1;

class Cycle {
    public void go() {
        System.out.println("Cycle");
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";

    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";

    public String toString() {
        return this.name;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";

    public String toString() {
        return this.name;
    }
}

class Test {
    public static void ride(Cycle c) {
        c.go();
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }
}