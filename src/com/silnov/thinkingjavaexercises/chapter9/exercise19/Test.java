package com.silnov.thinkingjavaexercises.chapter9.exercise19;

import java.util.Random;

interface Game {
    void play();
}

interface GameFactory {
    Game getGame();
}

class CoinToss implements Game {
    public void play() {
        Random rand = new Random();
        System.out.print("Toss Coin: ");
        switch (rand.nextInt(2)) {
        case 0:
            System.out.println("Tails");
            break;
        case 1:
            System.out.println("Heads");
            break;
        default:
            break;
        }
    }
}

class DiceThrow implements Game {
    public void play() {
        Random rand = new Random();
        System.out.println("Trow Dice: " + (rand.nextInt(6) + 1));
    }
}

class CoinTossFactory implements GameFactory {
    public Game getGame() {
        return new CoinToss();
    }
}

class DiceThrowFactory implements GameFactory {
    public Game getGame() {
        return new DiceThrow();
    }
}

public class Test {
    public static void playGame(GameFactory gf) {
        Game game = gf.getGame();
        game.play();
    }

    public static void main(String[] args) {
        playGame(new CoinTossFactory());
        playGame(new CoinTossFactory());
        playGame(new DiceThrowFactory());
        playGame(new CoinTossFactory());
        playGame(new DiceThrowFactory());
        playGame(new DiceThrowFactory());
    }
}
