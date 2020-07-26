package com.game;

import com.game.person.Player;
import com.game.room.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.game.MessageArt.*;

public class GameEngine {
    private final GameHelper gameHelper = new GameHelper(this);
    private Player player;
    private Console console = System.console();
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
    public void start() throws InterruptedException {
        //Display Title ASCII art
        titleMessage();
        //Accept player name from the console
        player = getPlayer();
        //Display text in to set the scene for the player
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana
        //Game loop starts once the player opts to ENTER
        while (true) {
            if ("E".equals(console.readLine("\nTYPE ACTION:").toUpperCase())) {
                for (Room room : roomList) {
                    //Updating the location of the player with the curRoom
                    player.getStatus().put("LOCATION", room.getClassName().value());
                    //Clear screen every time the player enters a new room
                    clearScreen();
                    //Display customized roomMessage as you enter the room
                    System.out.println("\n" + room.getMessage());
                    //Direct to the proper room actions interaction
                    actionInteraction(room, player);
                }
                //ASCII Art congrats message
                congratsMessage();
                //Once the player has gone through all the classrooms, the player enters OJT
                System.out.println("GOOD LUCK WITH OJT!");
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
                "\n\n--------------------------------------------");
        MessageArt.mapClean();
        System.out.println("\n\nACTIONS:[ENTER(E)]");
    }

    //Clears screen in the console
    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //Specific Classroom action cascade
    private void actionInteraction(Room room, Player player) throws InterruptedException {
        switch (room.getClassName()) {
            case LOBBY:
                gameHelper.lobbyAction(room, player);
                break;
            case JAVA:
            case JAVASCRIPT:
            case ALGORITHM:
            case LINUX:
            case PYTHON:
            case CAPSTONE:
                gameHelper.classActions(room, player);
                break;
        }
    }

    //Display map function
    private void displayMap() {

    }
    //ACCESSOR METHODS
    public List<Room> getRoomList() {
        return roomList;
    }
}
