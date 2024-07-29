package com.blackjack.client;

import com.blackjack.controller.Controller;

class Main {

    public static void main(String[] args) {
        // instantiate controller and say "go"
        Controller app = new Controller();
        app.execute();
    }
}