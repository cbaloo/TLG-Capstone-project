package com.game.tester;

import com.game.person.Player;
import com.game.room.Room;
import com.game.tester.GameEngineScanner;

import java.util.*;

import static com.game.GameEngine.clearScreen;

public class GameHelperScanner {
    //INSTANCE VARIABLE
    private final GameEngineScanner gameEngineScanner;
    //    private Console console=System.console();
//    private Scanner sc=new Scanner(System.in);
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
    public GameHelperScanner(GameEngineScanner gameEngineScanner) {
        this.gameEngineScanner = gameEngineScanner;
    }

    //Specific Lobby action cascade
    void lobbyAction(Room room, Player player, Scanner scanner) {
        while (true) {
            //Player response after reading the status and action options
//            String action = console.readLine("\nTYPE ACTION:");
            System.out.println("\nTYPE ACTION");
            String action = scanner.nextLine();
            //Only entrance to RommJava is allowed at this point, all the other rooms are closed
//            if (action.toUpperCase().equals("ENTER JAVA")) {
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
    void classActions(Room room, Player player, Scanner scanner) {
        while (true) {
            //Player response after reading the status and action options
//            String action = console.readLine("\nTYPE ACTION:");
            System.out.println("\nTYPE ACTION");
            String action = scanner.nextLine();
            //Get the next classroom name
            String nextClass=getRoomSequence().get(room.getClassName().value());
            //Present player with the java quiz once they pick quiz action
            if (action.toUpperCase().equals("Q")) {
                //Go through the quiz questions
                giveQuiz(room, player, scanner);
                //Once the quiz is done, remove the quiz from the actions list
                room.getActions().remove("TAKE QUIZ(Q)");
                //Once the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass,player );
            }
            else if(action.toUpperCase().equals("W")) {
                //Present player with wild card quiz if they pick that action
                giveWildcardQuiz(room, player, scanner);
                //Once the Wildcard quiz is done, remove it from the actions list
                room.getActions().remove("TAKE WILD CARD QUIZ(W)");
                //If the action list is empty after both quiz is taken, the next class room is opened and an "ENTER .....Classroom" option is added to the action list
                checkEmptyAction(room, nextClass,player );
            }
            else if(action.toUpperCase().equals("RETAKE CLASS")){
                player.getStatus().put("SCORE","0");
                clearScreen();
                System.out.println("--------------------------------------------");
                room.getActions().clear();
                room.getActions().add("TAKE QUIZ(Q)");
                room.getActions().add("TAKE WILD CARD QUIZ(W)");
                System.out.println("\nSTATUS: "+player.getStatus());
                System.out.println("\nACTIONS: "+room.getActions());
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
    private void giveWildcardQuiz(Room room, Player player, Scanner scanner) {
        for (String question : room.getWildcard().keySet()) {
//            String answer = console.readLine(question + ": ");
            System.out.println(question+": ");
            String answer=scanner.nextLine();
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
    private void giveQuiz(Room room, Player player, Scanner scanner) {
        for (String question : room.getQuiz().keySet()) {
//            String answer = console.readLine(question + ": ");
            System.out.println(question+": ");
            String answer=scanner.nextLine();
            if (answer.toUpperCase().equals(room.getQuiz().get(question))) {
                System.out.println("CORRECT!!!");
                //Player score needs to be updated +1 in this case
                updateScore(player);
            } else {
                System.out.println("NOPE, ANSWER: "+room.getQuiz().get(question));
                System.out.println(player.getStatus()+"\n");
            }
        }
    }

    //Checks if the room action list is empty, if true the next class entry option is added to the action list
    //TODO revert the method to private after test
    private void checkEmptyAction(Room room, String nextClass, Player player) {
        double score=Double.parseDouble(player.getStatus().get("SCORE"));
        double scorePercetage=(score/(room.getQuiz().size()+room.getWildcard().size()))*100.0;
        double roundedPercentage=Math.round(scorePercetage*100.0)/100.0;
        if (room.getActions().size() == 0 && scorePercetage>60.0) {
            System.out.println("NICELY DONE, YOU PASSED WITH "+roundedPercentage+"%");
            room.getActions().add(nextClass);
        }
        else if (room.getActions().size()==0 && scorePercetage<=60.00){
            System.out.println("YOU FAILED WITH "+roundedPercentage+"%");
            room.getActions().add("RETAKE CLASS");
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

    //ACCESSOR METHODS
    public Map<String, String> getRoomSequence() {
        return roomSequence;
    }

}