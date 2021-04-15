package com.silnov.thinkingjavaexercises.chapter8.exercise5;

class Cycle {
    private String name = "Cycle";

    public void go() {
        System.out.println(this);
    }

    public int wheels() {
        return 0;
    }

    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int weelsNumber = 1;

    public String toString() {
        return this.name;
    }

    public int wheels() {
        return 1;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int weelsNumber = 2;

    public String toString() {
        return this.name;
    }

    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int weelsNumber = 3;

    public String toString() {
        return this.name;
    }

    public int wheels() {
        return 3;
    }
}

class Test {
    public static void ride(Cycle c) {
        c.go();
        System.out.println(c.wheels());
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
