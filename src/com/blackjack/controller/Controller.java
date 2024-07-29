package com.blackjack.controller;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        promptForPlayerNames();
        startGame();
    }

    // DONE: Alice
    private void startGame() {
        System.out.println("The game has started !!!");
    }

    // DONE: Bob
    private void promptForPlayerNames() {
        for (int i = 0; i < 4; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Please enter your name: ");
                String name = scanner.nextLine().trim();
                if (!name.isEmpty()) {
                    validInput = true;
                    System.out.println("Thanks, " + name + "!");
                }
            }
        }
    }

    private void welcome() {
        System.out.println("Welcome to BlackJack !!!");
    }
}