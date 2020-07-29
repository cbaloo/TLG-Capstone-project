package com.game.client;

import com.game.GameEngine;

import java.io.Console;
//import com.game.tester.ConsoleAlt;

import java.io.IOException;

public class GameConsole {
    public static void main(String[] args) throws IOException, InterruptedException {

////CB ADDING HERE FOR THE MAP
//
//        File file = new File("C:\\StudentWork\\Capstone\\TLG-Capstone-project\\RetroGame\\src\\com\\game\\testtlg.txt");
//        Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name());
//        String content = null;
//        try (scanner){
//            content = scanner.useDelimiter("\\A").next();
//
//            //   } catch(IOException e){
//            //       e.printStackTrace();
//        }
//        // System.out.println(content);
//        System.out.println(content);
//      //CB ADDED CHANGE TILL HERE


        Console console = System.console();
//        ConsoleAlt c=new ConsoleAlt();
        if (console == null) {
            System.out.print("NO CONSOLE AVAILABLE");
            return;
        }

        GameEngine gameEngine = new GameEngine();
        gameEngine.start();

    }
}
