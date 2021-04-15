package com.silnov.thinkingjavaexercises.exercise6;

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Constructor Chess()");
    }

    public static void main(String[] args) {
        Chess test = new Chess();
    }
}

class Game {
    Game(int i) {
        System.out.println("Constructor Game()");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i); // if we comment this line, compilation will faild
        System.out.println("Constructor BoardGame()");
    }
}