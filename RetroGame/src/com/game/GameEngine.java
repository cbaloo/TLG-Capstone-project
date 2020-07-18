package com.game;

import com.game.person.Player;
import com.game.room.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameEngine {
    public Player player;
    public  Console console=System.console();
    public List<Room> roomList=new ArrayList(Arrays.asList(
            new Lobby(),
            new RoomJava(),
            new RoomJS(),
            new RoomAlgorithm(),
            new RoomLinux(),
            new RoomPython(),
            new RoomCapstone()
    ));

    //Method to start the game
    public void start(){
        player= getPlayer();
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana

        //TODO Game loop starts once the player opts to ENTER
        while (true) {
            if ("ENTER".equals(console.readLine("\nType action:").toUpperCase())) {
                for (Room room : roomList) {
                    //Updating the location of the player with the curRoom
                    player.getStatus().put("Location", room.getName().value());
                    //Display roomMessage as you enter the room
                    System.out.println("\n"+room.getMessage());
                    //Display player status
                    System.out.println("\nSTATUS: " + player.getStatus());
                    //Display action options
                    System.out.println("ACTIONS: " + room.getActions());
                    //Direct to the proper room actions interaction
                    actionInteraction(room);
                }
                break;
                //TODO once in the lobby message,actions and status displayed, only java and breakout is open for entry, all others are closed with a  smart-ass comment
                //TODO pass/stuck-in-java after quiz, if pass python opens and the same pattern follows, go to lobby and then to python
            }
            else{
                System.out.println("Invalid Entry!");
            }
        }
    }

    //Get player name from the console and then return a Player
    private Player getPlayer(){
        String playerName;
        Player curPlayer;
        while(true){
            playerName=console.readLine("What do you want your name to be: ");
            try{
                curPlayer= new Player(playerName);
                return curPlayer;
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    //Display Welcome message and give a rundown of how to play the game
    private void displayWelcomeMsg(String name){
        System.out.println("\n\nHEY "+name.toUpperCase()+"! \n\nWELCOME TO THE TLG LEARNING FACILITY IN BELLEVUE, WA!\nCONGRATULATIONS!!! YOU ARE A BRAND SPANKING NEW SDE APPRENTICE. BE READY FOR AN EXCITING RIDE TO AMAZON. \n\nWARNING!!! BEFORE ENTERING BUCKLE UP WITH LOADS OF ENTHUSIASM. TO GET TO OJT YOU HAVE TO GO THROUGH THE GATEKEEPERS: TLG INSTRUCTORS AND STAFF.\n\nGOOD LUCK AND GODSPEED.\n\nACTIONS:[ENTER,]");
    }


    //Specific Lobby action cascade
    private void lobbyAction(Room room){
        while(true){
            //Player response after reading the status and action options
            String action=console.readLine("\nType action:");
            //Only entrance to RommJava is allowed at this point, all the other rooms are closed
            if(action.toUpperCase().equals("enter java".toUpperCase())){
                return;
            }
            else if(action.isEmpty()){
                System.out.println("Invalid Entry!");
            }
            else if (room.getActions().contains(action.toUpperCase())){
                System.out.println("Tough luck little Grasshopper, you are not worthy of entering this room yet!");
            }
            else{
                System.out.println("HINT: JAVA!");
            }
        }
    }

    private void javaAction(Room room){
        while(true){
            //Player response after reading the status and action options
            String action=console.readLine("\nType action:");
            //Present player with the java quiz once they pick that action
            if(action.toUpperCase().equals("TAKE JAVA QUIZ")){
                for(String question:room.getQuiz().keySet()){
                    String answer=console.readLine(question+": ");
                    if(answer.equals(room.getQuiz().get(question))){
                        System.out.println("Correct!!!");
                    }
                    else{
                        System.out.println("Nope!!!");
                    }
                }
                return;
            }
            //Present player with wild card quiz if they pick that action
            else if(action.toUpperCase().equals("TAKE WILD CARD QUIZ")){
                for(String question:room.getWildcard().keySet()){
                    String answer=console.readLine(question+": ");
                    if(answer.equals(room.getWildcard().get(question))){
                        System.out.println("Correct!!!");
                    }
                    else{
                        System.out.println("Nope!!!");
                    }
                }
                return;
            }
            else{
                System.out.println("Invalid Entry!");
            }
        }
    }

    private void actionInteraction(Room room) {
        switch (room.getName()) {
            case LOBBY:
                lobbyAction(room);
                break;
            case JAVA:
                javaAction(room);
                break;
            case JAVASCRIPT:
                System.out.println("\n" + ((RoomJS) room).getMessage());
                break;
            case ALGORITHM:
                System.out.println("\n" + ((RoomAlgorithm) room).getMessage());
                break;
            case PYTHON:
                System.out.println("\n" + ((RoomPython) room).getMessage());
                break;
            case LINUX:
                System.out.println("\n" + ((RoomLinux) room).getMessage());
                break;
            case CAPSTONE:
                System.out.println("\n" + ((RoomCapstone) room).getMessage());
                break;
            case BREAKOUT:
                System.out.println("\n" + ((RoomBreakout) room).getMessage());
        }
    }


    //Display map function
    private void displayMap(){

    }

}
