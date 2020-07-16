package com.game.client;

import com.game.GameEngine;

import java.io.Console;

public class GameConsole {
    public static void main(String[] args) {
        Console console= System.console();
        if (console == null) {
            System.out.print("No console available");
            return;
        }

        GameEngine gameEngine= new GameEngine();
        gameEngine.start();
    }
}
