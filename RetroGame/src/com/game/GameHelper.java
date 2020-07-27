package com.game;

import com.game.person.Player;
import com.game.accesory.IceBreaker;
import com.game.room.Room;

import java.io.Console;
import java.security.KeyStore;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static com.game.GameEngine.clearScreen;
import static com.game.accesory.MessageArt.duckMessage;
import static com.game.accesory.MessageArt.duckMessageTwo;

public class GameHelper {
    //INSTANCE VARIABLE
    private final GameEngine gameEngine;
    private Console console=System.console();
    private Map<String,String> roomSequence=new HashMap<>() {
        {
            put("LOBBY","ENTER JAVA(J)");
            put("JAVA","ENTER JAVASCRIPT(JS)");
            put("JAVASCRIPT","ENTER ALGORITHM(A)");
            put("ALGORITHM","ENTER LINUX(L)");
            put("LINUX","ENTER PYTHON(P)");
            put("PYTHON","ENTER CAPSTONE(C)");
            put("CAPSTONE","ENTER AMAZON(AMZ)");
        }
    };

    //CONSTRUCTOR
    public GameHelper(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    //Specific Lobby action cascade
    void lobbyAction(Room room, Player player) {
        room.printMap();
        System.out.println("\nSTATUS: " + player.getStatus());
        //Display action options available to the player
        System.out.println("ACTIONS: " + room.getActions());
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nTYPE ACTION:");
            //Only entrance to RoomJava is allowed at this point, all the other rooms are closed
            if (action.toUpperCase().equals("J")) {
                return;
            } else if (action.isEmpty()) {
                System.out.println("INVALID ENTRY!");

            } else {
                System.out.println("HINT: JAVA!");
            }
        }
    }

    //All classroom have similar actions(Quiz, Wildcard quiz) that the player has to go through
    void classActions(Room room, Player player) {
        room.printMap();
        System.out.println("\nFIRST, LETS DO AN ICEBREAKER!!\n");
        giveIceBreaker(room);
        System.out.println("\nSTATUS: " + player.getStatus());
        //Display action options available to the player
        System.out.println("ACTIONS: " + room.getActions());
        //Flag to ensure one entry to quiz and wildcard options
        Map<String,Boolean> quizFlag=new HashMap<>(){
            {
                put("Q",Boolean.TRUE);
                put("W",Boolean.TRUE);}
        };
        while (true) {
            //Player response after reading the status and action options
            String action = console.readLine("\nTYPE ACTION:");
            //Get the next classroom name
            String nextClass = getRoomSequence().get(room.getClassName().value());
            //Present player with the java quiz once they pick quiz action
            if (action.toUpperCase().equals("Q")&&quizFlag.get("Q")) {
                //Go through the quiz questions
                giveQuiz(room, player);
                //Once the quiz is done, remove the quiz from the actions list
                room.getActions().remove("TAKE QUIZ(Q)");
                quizFlag.put("Q", Boolean.FALSE);
                if (room.getClassName().value().equals("JAVA")) {
                    try{
                        giveDuckRace();
                    }
                    catch(InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
                else if(room.getClassName().value().equals("JAVASCRIPT")){
                    room.getInstructor().setName("NELLY");
                    System.out.println("\nYOUR INSTRUCTOR IS "+ room.getInstructor().getName()+" NOW.");
                }
                //Once the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass, player);
            }
            else if (action.toUpperCase().equals("W")&& quizFlag.get("W")) {
                //Present player with wild card quiz if they pick that action
                giveWildcardQuiz(room, player);
                //Once the Wildcard quiz is done, remove it from the actions list
                room.getActions().remove("TAKE WILD CARD QUIZ(W)");
                quizFlag.put("W",Boolean.FALSE);
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass, player);
            } else if (action.toUpperCase().equals("RE")) {
                player.getStatus().put("SCORE", "0");
                clearScreen();
                System.out.println("--------------------------------------------");
                room.getActions().clear();
                room.getActions().add("TAKE QUIZ(Q)");
                room.getActions().add("TAKE WILD CARD QUIZ(W)");
                System.out.println("\nSTATUS: " + player.getStatus());
                System.out.println("\nACTIONS: " + room.getActions());
            } else if (action.toUpperCase().equals(getActionLetters(nextClass))) {
                player.getStatus().put("SCORE", "0");
                return;
            } else {
                System.out.println("INVALID ENTRY!");
            }
        }
    }

    private void giveDuckRace() throws InterruptedException {
        List<String> classmates = new ArrayList(Arrays.asList(
                "JOSH", "BRAD", "HIRO", "KG", "CODY", "GURU", "CHANDANA", "DHRUTI", "BRANDON", "DAVID",
                "KUSHAL", "BRUCE", "KERVIN", "TAPAN", "DAEUN", "NEILL", "RJ", "TERRELL", "MICHAEL"));
        System.out.println("TIME FOR A SHORT BREAK!!");
        TimeUnit.SECONDS.sleep(1);
        duckMessage();
        TimeUnit.SECONDS.sleep(1);
        duckMessageTwo();
        TimeUnit.SECONDS.sleep(5);
        Collections.shuffle(classmates);
        System.out.println(classmates.get(0) + " WINS THE DUCK RACE!");
        TimeUnit.SECONDS.sleep(3);
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
                System.out.println("NOPE, ANSWER: " + room.getQuiz().get(question));
                System.out.println(player.getStatus() + "\n");
            }
        }
    }

    private void giveIceBreaker(Room room) {
        String answer = console.readLine(room.getInstructor().getName() + ": " + IceBreaker.getIceBreaker() + ":");
    }

    //Checks if the room action list is empty, if true the next class entry option is added to the action list
    //TODO revert the method to private after test
    private void checkEmptyAction(Room room, String nextClass, Player player) {
        double score = Double.parseDouble(player.getStatus().get("SCORE"));
        double scorePercentage = (score / (room.getQuiz().size() + room.getWildcard().size())) * 100.0;
        double roundedPercentage = Math.round(scorePercentage * 100.0) / 100.0;
        if (room.getActions().size() == 0 && scorePercentage > 60.0) {
            System.out.println("NICELY DONE, YOU PASSED WITH " + roundedPercentage + "%");
            room.getActions().add(nextClass);
        } else if (room.getActions().size() == 0 && scorePercentage <= 60.00) {
            System.out.println("YOU FAILED WITH " + roundedPercentage + "%");
            room.getActions().add("RETAKE CLASS(RE)");
            room.getActions().add(nextClass);
        }
        System.out.println("\nACTIONS: " + room.getActions());
    }

    //Updates score of the student
    //TODO revert the method to private after test
    private void updateScore(Player player){
        //Get current score
        String curScore=player.getStatus().get("SCORE");
        //Add 1 to curScore which is String number
        Integer updatedScore=Integer.parseInt(curScore)+1;
        String newScore=String.valueOf(updatedScore);
        player.getStatus().put("SCORE",newScore);
        System.out.println(player.getStatus()+"\n");
    }
    //Get the substring between () of actions
    private String getActionLetters(String action){
        return action.substring(action.indexOf("(")+1,action.indexOf(")"));
    }

    //ACCESSOR METHODS
    public Map<String, String> getRoomSequence() {
        return roomSequence;
    }

}