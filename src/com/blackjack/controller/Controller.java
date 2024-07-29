package com.blackjack.controller;

public class Controller {

    public void execute() {
        welcome();
        promptForPlayerNames();
        startGame();
    }

    // DONE: Alice
    private void startGame() {
        System.out.println("The game has started !!!");
    }

    // TODO: Bob
    private void promptForPlayerNames() {

    }

    private void welcome() {
        System.out.println("Welcome to BlackJack !!!");
    }
}