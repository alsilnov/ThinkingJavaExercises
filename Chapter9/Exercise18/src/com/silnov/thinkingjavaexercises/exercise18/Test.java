package com.silnov.thinkingjavaexercises.exercise18;
interface Cycle {
    void ride();
}
interface CycleFactory {
    Cycle getCycle();
}
class Unicycle implements Cycle {
    public void ride() {
        System.out.println("Unicycle ride()");
    }
}
class Bicycle implements Cycle {
    public void ride() {
        System.out.println("Bicycle ride()");
    }
}
class Tricycle implements Cycle {
    public void ride() {
        System.out.println("Tricycle ride()");
    }
}
class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle(); 
    }
}
class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle(); 
    }
}
class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle(); 
    }
}
public class Test {
    public static void rideCycle(CycleFactory cf) {
        Cycle c = cf.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        rideCycle(new BicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
        rideCycle(new UnicycleFactory());
    }
}
