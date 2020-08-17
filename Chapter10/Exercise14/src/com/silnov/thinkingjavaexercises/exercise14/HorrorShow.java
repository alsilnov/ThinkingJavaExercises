package com.silnov.thinkingjavaexercises.exercise14;

interface Monster {
    void menace();
  }
interface DangerousMonster extends Monster {
void destroy();
}
interface Lethal {
void kill();
}
class DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
        System.out.println("");
    }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
        System.out.println("");
    }
    static void w(Lethal l) {
        l.kill();
    }
    static Vampire makerVampire() {
        return new Vampire() {
            public void menace() { System.out.println("Vampire menace()"); }
            public void destroy() { System.out.println("Vampire destroy()"); }
            public void kill() { System.out.println("Vampire kill()"); }
            public void drinkBlood() { System.out.println("Vampire drinkBlood()"); }
        };           
    }
    static DangerousMonster makerDangerousMonster() {
        return new DangerousMonster() {
            public void menace() { System.out.println("DangerousMonster menace()"); }
            public void destroy() { System.out.println("DangerousMonster destroy()"); }
        };           
    }
    public static void main(String[] args) {
        u(makerDangerousMonster());
        v(makerDangerousMonster());
        u(makerVampire());
        v(makerVampire());
        w(makerVampire());
    }
} 