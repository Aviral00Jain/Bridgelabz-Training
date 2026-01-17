package com.gamebox;


public class GameBoxApp {

    public static void main(String[] args) {

        Game arcade = new ArcadeGame("Street Rush", 299, 4.5);
        Game strategy = new StrategyGame("War Tactics", 499, 4.8);

        arcade.playDemo();
        strategy.playDemo();

        arcade.applyDiscount(20);

        User user = new User("Shanaya");
        user.buyGame(arcade);
        user.buyGame(strategy);
        user.showLibrary();
    }
}
