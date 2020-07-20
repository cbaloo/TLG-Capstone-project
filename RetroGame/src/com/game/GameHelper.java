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
            put("LOBBY","ENTER JAVA");
            put("JAVA","ENTER JAVASCRIPT");
            put("JAVASCRIPT","ENTER ALGORITHM");
            put("ALGORITHM","ENTER LINUX");
            put("LINUX","ENTER PYTHON");
            put("PYTHON","ENTER CAPSTONE");
            put("CAPSTONE","ENTER AMAZON");
        }
    };

    //CONSTRUCTOR
    public GameHelper(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    //Specific Lobby action cascade
    void lobbyAction(Room room) {
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nTYPE ACTION:");
            //Only entrance to RommJava is allowed at this point, all the other rooms are closed
            if (action.toUpperCase().equals("ENTER JAVA")) {
                return;
            } else if (action.isEmpty()) {
                System.out.println("INVALID ENTRY!");
            } else if (room.getActions().contains(action.toUpperCase())) {
                System.out.println("TOUGH LUCK LITTLE GRASSHOPPER, YOU ARE NOT WORTHY OF ENTERING THIS ROOM YET!");
            } else {
                System.out.println("HINT: JAVA!");
            }
        }
    }

    void classActions(Room room) {
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nTYPE ACTION:");
            //Present player with the java quiz once they pick that action
            String nextClass=getRoomSequence().get(room.getName().value());
            if (action.toUpperCase().equals("TAKE QUIZ")) {
                for (String question : room.getQuiz().keySet()) {
                    String answer = console.readLine(question + ": ");
                    if (answer.toUpperCase().equals(room.getQuiz().get(question))) {
                        System.out.println("CORRECT!!!");
                    } else {
                        System.out.println("NOPE!!!");
                    }
                }
                room.getActions().remove("TAKE QUIZ");
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass);
            }
            else if(action.toUpperCase().equals("TAKE WILD CARD QUIZ")) {
                //Present player with wild card quiz if they pick that action
                for (String question : room.getWildcard().keySet()) {
                    String answer = console.readLine(question + ": ");
                    if (answer.toUpperCase().equals(room.getWildcard().get(question))) {
                        System.out.println("CORRECT!!!");
                    } else {
                        System.out.println("NOPE!!!");
                    }
                }
                room.getActions().remove("TAKE WILD CARD QUIZ");
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass);
            }
            else if(action.toUpperCase().equals(nextClass)) {
                return;
            }
            else {
                System.out.println("INVALID ENTRY!");
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