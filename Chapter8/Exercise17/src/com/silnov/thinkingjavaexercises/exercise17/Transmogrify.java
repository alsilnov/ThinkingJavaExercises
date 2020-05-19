package com.silnov.thinkingjavaexercises.exercise17;
class AlertStatus {
    public void alert() {
    }
}
class NormalStatus extends AlertStatus {
    public void alert() {
        System.out.println("NormalStatus");
    }
}
class MiddleStatus extends AlertStatus {
    public void alert() {
        System.out.println("MiddleStatus");
    }
}
class HightStatus extends AlertStatus {
    public void alert() {
        System.out.println("HightStatus");
    }
}
class Starship {
    private AlertStatus status = new NormalStatus();
    private int i = 0;
    public void changeStatus() {
        switch (++i % 3) {
            case 0:
                status = new NormalStatus();         
                break;
            case 1:
                status = new MiddleStatus();
                break;
            case 2:
                status = new HightStatus();
                break;
            default:
                break;
        }
    }
    public void alert() {
        status.alert();
    }
}
public class Transmogrify {
    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.alert();
        ship.changeStatus();
        ship.alert();
        ship.changeStatus();
        ship.alert();
        ship.changeStatus();
        ship.alert();
    }
}