package com.gamebox;

class StrategyGame extends Game {

    StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    
    public void playDemo() {
        System.out.println("Think-before-you-move strategy demo of " + title);
    }
}
