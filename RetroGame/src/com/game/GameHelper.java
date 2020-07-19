package com.game;

import com.game.room.Room;

import java.io.Console;

public class GameHelper {
    //INSTANCE VARIABLE
    private final GameEngine gameEngine;
    private Console console=System.console();

    //CONSTRUCTOR
    public GameHelper(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    //Specific Lobby action cascade
    void lobbyAction(Room room) {
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nType action:");
            //Only entrance to RommJava is allowed at this point, all the other rooms are closed
            if (action.toUpperCase().equals("enter java".toUpperCase())) {
                return;
            } else if (action.isEmpty()) {
                System.out.println("Invalid Entry!");
            } else if (room.getActions().contains(action.toUpperCase())) {
                System.out.println("Tough luck little Grasshopper, you are not worthy of entering this room yet!");
            } else {
                System.out.println("HINT: JAVA!");
            }
        }
    }

    void javaAction(Room room) {
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nType action:");
            //Present player with the java quiz once they pick that action
            if (action.toUpperCase().equals("TAKE JAVA QUIZ")) {
                for (String question : room.getQuiz().keySet()) {
                    String answer = console.readLine(question + ": ");
                    if (answer.equals(room.getQuiz().get(question))) {
                        System.out.println("Correct!!!");
                    } else {
                        System.out.println("Nope!!!");
                    }
                }
                room.getActions().remove("Take java quiz");
                if (room.getActions().size() == 0) {
                    room.getActions().add("ENTER JAVASCRIPT");
                    room.setActions(room.getActions());
                }
                System.out.println("\nACTIONS: " + room.getActions());
            }
            //Present player with wild card quiz if they pick that action
            else if (action.toUpperCase().equals("TAKE WILD CARD QUIZ")) {
                for (String question : room.getWildcard().keySet()) {
                    String answer = console.readLine(question + ": ");
                    if (answer.equals(room.getWildcard().get(question))) {
                        System.out.println("Correct!!!");
                    } else {
                        System.out.println("Nope!!!");
                    }
                }
                room.getActions().remove("Take wild card quiz");
                if (room.getActions().size() == 0) {
                    room.getActions().add("ENTER JAVASCRIPT");
                    room.setActions(room.getActions());
                }
                System.out.println("\nACTIONS: " + room.getActions());
            } else if (action.toUpperCase().equals("ENTER JAVASCRIPT")) {
                return;
            } else {
                System.out.println("Invalid Entry!");
            }
        }
    }
}