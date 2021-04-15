package com.silnov.thinkingjavaexercises.chapter9.exercise12;

interface CanFight {
    public void fight();
}

interface CanSwim {
    public void swim();
}

interface CanFly {
    public void fly();
}

interface CanClimb {
    public void canClimb();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    public void swim() {
    }

    public void fly() {
    }

    public void canClimb() {
    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}