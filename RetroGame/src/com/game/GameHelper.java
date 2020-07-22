package com.game;

import com.game.person.Player;
import com.game.room.Room;
import com.game.room.RoomBreakout;

import javax.sql.rowset.BaseRowSet;
import java.io.Console;
import java.util.*;

import static com.game.GameEngine.clearScreen;

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

    //All classroom have similar actions(Quiz, Wildcard quiz) that the player has to go through
    void classActions(Room room, Player player) {
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nTYPE ACTION:");
            //Get the next classroom name
            String nextClass=getRoomSequence().get(room.getClassName().value());
            //Present player with the java quiz once they pick quiz action
            if (action.toUpperCase().equals("Q")) {
                //Go through the quiz questions
                giveQuiz(room, player);
                //Once the quiz is done, remove the quiz from the actions list
                room.getActions().remove("TAKE QUIZ(Q)");
                //Once the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass,player );
            }
            else if(action.toUpperCase().equals("W")) {
                //Present player with wild card quiz if they pick that action
                giveWildcardQuiz(room, player);
                //Once the Wildcard quiz is done, remove it from the actions list
                room.getActions().remove("TAKE WILD CARD QUIZ(W)");
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass,player );
            }
            else if(action.toUpperCase().equals("ENTER BREAKOUT")){
                player.getStatus().put("SCORE","0");
                Room breakout =new RoomBreakout();
                breakoutActions(breakout, player);
            }
            else if(action.toUpperCase().equals(nextClass)) {
                player.getStatus().put("SCORE","0");
                return;
            }
            else {
                System.out.println("INVALID ENTRY!");
            }
        }
    }

    //Goes through asking the wildcard questions
    private void giveWildcardQuiz(Room room, Player player) {
        for (String question : room.getWildcard().keySet()) {
            String answer = console.readLine(question + ": ");
            if (answer.toUpperCase().equals(room.getWildcard().get(question))) {
                System.out.println("CORRECT!!!");
                //Player score needs to be updated +1 in this case
                updateScore(player);
            } else {
                //TODO give player one more attempt at answer
                System.out.println("NOPE, ANSWER: "+room.getWildcard().get(question));
                System.out.println(player.getStatus()+"\n");
            }
        }
    }
    //Goes through asking quiz questions
    private void giveQuiz(Room room, Player player) {
        for (String question : room.getQuiz().keySet()) {
            String answer = console.readLine(question + ": ");
            if (answer.toUpperCase().equals(room.getQuiz().get(question))) {
                System.out.println("CORRECT!!!");
                //Player score needs to be updated +1 in this case
                updateScore(player);
            } else {
                //TODO give player one more attempt at answer
                System.out.println("NOPE, ANSWER: "+room.getQuiz().get(question));
                System.out.println(player.getStatus()+"\n");
            }
        }
    }

    //TODO enter breakout cascade and return to the same room to retake the test or proceed to the next room
    public void breakoutActions(Room room, Player player){
        //Updating the location of the player with the curRoom
        player.getStatus().put("LOCATION", room.getClassName().value());
        //Clear screen every time the player enters a new room
        clearScreen();
        //Display customized roomMessage as you enter the room
        System.out.println("\n" + room.getMessage());
        //Display Instructor present in the room
        System.out.println("\n" + room.getInstructor().getName().toUpperCase() + " IS IN CHARGE NOW, " + "SO YOU BETTER PAY ATTENTION");
        //Display player status which includes their location and score
        System.out.println("\nSTATUS: " + player.getStatus());
        //Display action options available to the player
        System.out.println("ACTIONS: " + room.getActions());
    }


    //Checks if the room action list is empty, if true the next class entry option is added to the action list
    //TODO revert the method to private after test
    public void checkEmptyAction(Room room, String nextClass, Player player) {
        double score=Double.parseDouble(player.getStatus().get("SCORE"));
        double scorePercetage=(score/6.0)*100.0;
        double roundedPercentage=Math.round(scorePercetage*100.0)/100.0;
        if (room.getActions().size() == 0 && scorePercetage>60.0) {
            System.out.println("NICELY DONE, YOU PASSED WITH "+roundedPercentage+"%");
            room.getActions().add(nextClass);
//            room.setActions(room.getActions());
        }
        else if (room.getActions().size()==0 && scorePercetage<=60.00){
            System.out.println("YOU FAILED WITH "+roundedPercentage+"%");
            room.getActions().add("ENTER BREAKOUT");
//            room.setActions(room.getActions());
        }
        System.out.println("\nACTIONS: " + room.getActions());
    }

    //Updates score of the student
    //TODO revert the method to private after test
    public void updateScore(Player player){
        //Get current score
        String curScore=player.getStatus().get("SCORE");
        //Add 1 to curScore which is String number
        Integer updatedScore=Integer.parseInt(curScore)+1;
        String newScore=String.valueOf(updatedScore);
        player.getStatus().put("SCORE",newScore);
        System.out.println(player.getStatus()+"\n");
    }

    //ACCESSOR METHODS
    public Map<String, String> getRoomSequence() {
        return roomSequence;
    }

}