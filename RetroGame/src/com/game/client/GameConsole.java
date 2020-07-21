package com.game.client;

import com.game.GameEngine;

import java.io.Console;
import java.io.IOException;

public class GameConsole {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        if (console == null) {
            System.out.print("NO CONSOLE AVAILABLE");
            return;
        }

        GameEngine gameEngine = new GameEngine();
        gameEngine.start();
    }
}
