package com.game;

import com.game.room.Room;

import java.io.Console;
import java.util.*;

public class GameHelper {
    //INSTANCE VARIABLE
    private final GameEngine gameEngine;
    private Console console=System.console();
    private Map<String,String> roomSequence=new HashMap<>() {
        {
            put("Lobby","ENTER JAVA");
            put("Java","ENTER JAVASCRIPT");
            put("JavaScript","ENTER ALGORITHM");
            put("Algorithm","ENTER LINUX");
            put("Linux","ENTER PYTHON");
            put("Python","ENTER CAPSTONE");
            put("Capstone","ENTER AMAZON");
        }
    };

    //CONSTRUCTOR
    public GameHelper(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    //Specific lobby action cascade
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

    void classActions(Room room) {
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nType action:");
            //Present player with the java quiz once they pick that action
            String nextClass=getRoomSequence().get(room.getName().value());
            if (action.toUpperCase().equals("TAKE QUIZ")) {
                for (String question : room.getRooQuiz().keySet()) {
                    String answer = console.readLine(question + ": ");
                    if (answer.equals(room.getRooQuiz().get(question))) {
                        System.out.println("Correct!!!");
                    } else {
                        System.out.println("Nope!!!");
                    }
                }
                room.getActions().remove("Take quiz");
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass);
            }
            else if(action.toUpperCase().equals("TAKE WILD CARD QUIZ")) {
                //Present player with wild card quiz if they pick that action
                for (String question : room.getWildcard().keySet()) {
                    String answer = console.readLine(question + ": ");
                    if (answer.equals(room.getWildcard().get(question))) {
                        System.out.println("Correct!!!");
                    } else {
                        System.out.println("Nope!!!");
                    }
                }
                room.getActions().remove("Take wild card quiz");
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass);
            }
            else if(action.toUpperCase().equals(nextClass)) {
                return;
            }
            else {
                System.out.println("Invalid Entry!");
            }
        }
    }

    //Checks if the room action list is empty, if true the next class entry is added to the action list
    private void checkEmptyAction(Room room, String nextClass) {
        if (room.getActions().size() == 0) {
            room.getActions().add(nextClass);
            room.setActions(room.getActions());
        }
        System.out.println("\nACTIONS: " + room.getActions());
    }

    //ACCESSOR METHODS
    public Map<String, String> getRoomSequence() {
        return roomSequence;
    }

}