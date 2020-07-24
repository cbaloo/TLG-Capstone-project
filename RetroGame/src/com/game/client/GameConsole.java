package com.game.client;

import com.game.GameEngine;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GameConsole {
    public static void main(String[] args) throws IOException, InterruptedException {

//CB ADDING HERE FOR THE MAP

        File file = new File("C:\\StudentWork\\Capstone\\TLG-Capstone-project\\RetroGame\\src\\com\\game\\testtlg.txt");
        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());
        String content = null;
        try (scanner){
            content = scanner.useDelimiter("\\A").next();

            //   } catch(IOException e){
            //       e.printStackTrace();
        }
        // System.out.println(content);
        System.out.println(content);
      //CB ADDED CHANGE TILL HERE


        Console console = System.console();
        if (console == null) {
            System.out.print("NO CONSOLE AVAILABLE");
            return;
        }

        GameEngine gameEngine = new GameEngine();
        gameEngine.start();

    }
}
