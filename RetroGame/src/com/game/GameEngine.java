package com.game;

import com.game.person.Player;
import com.game.room.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameEngine {
    private final GameHelper gameHelper = new GameHelper(this);
    private Player player;
    private   Console console=System.console();
    private List<Room> roomList=new ArrayList(Arrays.asList(
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
                    //Display Instructor/Staff present in the room
                    System.out.println("\n"+room.getInstructor().getName().toUpperCase()+" IS IN CHARGE NOW. SO YOU BETTER PAY ATTENTION");
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
        gameHelper.lobbyAction(room);
    }
    private void javaAction(Room room){
        gameHelper.javaAction(room);
    }

    private void actionInteraction(Room room) {
        switch (room.getName()) {
            case LOBBY:
                gameHelper.lobbyAction(room);
                break;
            case JAVA:
                gameHelper.javaAction(room);
                break;
            case JAVASCRIPT:
                gameHelper.javascriptAction(room);
                break;
            case ALGORITHM:
                gameHelper.algorithmAction(room);
                break;
            case PYTHON:
                System.out.println("actionInteraction Python");
                break;
            case LINUX:
                gameHelper.linuxAction(room);
                break;
            case CAPSTONE:
                System.out.println("actionInteraction Capstone");
                break;
            case BREAKOUT:
                System.out.println("actionInteraction Breakout");
        }
    }


    //Display map function
    private void displayMap(){

    }

}
