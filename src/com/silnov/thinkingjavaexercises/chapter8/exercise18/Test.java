package com.silnov.thinkingjavaexercises.chapter8.exercise18;

class Cycle {
    public void go() {
        System.out.println("Cycle");
    }
}

class Unicycle extends Cycle {
    private String name = "Unicycle";

    public void balance() {
        System.out.println("Unicycle.balance()");
    }

    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";

    public void balance() {
        System.out.println("Bicycle.balance()");
    }

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
        Cycle bicycle = new Bicycle();
        Cycle unicycle = new Unicycle();
        Cycle tricycle = new Tricycle();
        // bicycle.balance();
        // unicycle.balance();
        // tricycle.balance();
        ((Bicycle) bicycle).balance();
        ((Unicycle) unicycle).balance();
        // ((Tricycle)tricycle).balance();
        // ((Bicycle)tricycle).balance();
    }
}