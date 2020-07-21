package com.game;

import com.game.person.Player;
import com.game.room.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; //CB

public class GameEngine {
    private final GameHelper gameHelper = new GameHelper(this);
    private Player player;
    private Console console = System.console();
    public static Scanner in = new Scanner(System.in); // CB
    public static  String instructions; //CB
    private List<Room> roomList = new ArrayList(Arrays.asList(
            new Lobby(),
            new RoomJava(),
            new RoomJS(),
            new RoomAlgorithm(),
            new RoomLinux(),
            new RoomPython(),
            new RoomCapstone()
    ));

    //Method to start the game
    public void start() {
        //Accept player name from the console
        player= getPlayer();
        //Display text in to set the scene for the player
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana

        //Game loop starts once the player opts to ENTER
        while (true) {
            if ("ENTER".equals(console.readLine("\nTYPE ACTION:").toUpperCase())) {
                for (Room room : roomList) {
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
                    //Direct to the proper room actions interaction
                    actionInteraction(room);
                }
                //Once the player has gone through all the classrooms, the player enters OJT
                System.out.println("CONGRATULATIONS!!! GOOD LUCK WITH OJT.");
                //Game exit
                System.exit(0);
            } else {
                System.out.println("INVALID ENTRY!");
            }
        }
    }

    //Get player name from the console and then return a Player
    private Player getPlayer() {
        String playerName;
        Player curPlayer;
        while (true) {
            playerName = console.readLine("\nWHAT IS YOUR NAME?: ");
            try {
                curPlayer = new Player(playerName);
                return curPlayer;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //Display Welcome message and give a rundown of how to play the game
    private void displayWelcomeMsg(String name) {
        System.out.println("--------------------------------------------" +
                "\n\nHEY " + name.toUpperCase() + "! " +
                "\n\nWELCOME TO THE TLG LEARNING FACILITY IN BELLEVUE, WA!" +
                "\nCONGRATULATIONS!!! YOU ARE A BRAND SPANKING NEW SDE APPRENTICE. " +
                "\nBE READY FOR AN EXCITING RIDE TO AMAZON. " +
                "\n\nWARNING!!! BEFORE ENTERING BUCKLE UP WITH LOADS OF ENTHUSIASM. " +
                "\nTO GET TO OJT YOU HAVE TO GO THROUGH THE GATEKEEPERS: TLG INSTRUCTORS AND STAFF." +
                "\n\nGOOD LUCK AND GODSPEED." +
                "\n\n--------------------------------------------" +
                "\n\nACTIONS:[ENTER,]");
    }

    //Clears screen in the console
    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    //Specific Classroom action cascade
    private void actionInteraction(Room room) {
        switch (room.getClassName()) {
            case LOBBY:
                gameHelper.lobbyAction(room);
                break;
            case JAVA:
            case JAVASCRIPT:
            case ALGORITHM:
            case LINUX:
            case PYTHON:
            case CAPSTONE:
                gameHelper.classActions(room);
                break;
            case BREAKOUT:
                System.out.println("ACTION INTERACTION BREAKOUT");
                break;
        }
    }

    //Display map function
    private void displayMap() {

    }

}
