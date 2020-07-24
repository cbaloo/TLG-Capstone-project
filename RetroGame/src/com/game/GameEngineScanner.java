package com.game;

import com.game.person.Player;
import com.game.room.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.game.MessageArt.*;

public class GameEngineScanner {
    private final GameHelperScanner gameHelperScanner = new GameHelperScanner(this);
    private Player player;
    //    private Console console = System.console();
//    private Scanner sc=new Scanner(System.in);
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
    public void start(Scanner scanner) {
        //Display Title ASCII art
        titleMessage();
        //Accept player name from the console
        player = getPlayer(scanner);
        //Display text in to set the scene for the player
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana
        //Game loop starts once the player opts to ENTER
        while (true) {
            System.out.println("\nTYPE ACTION:");
            String action=scanner.nextLine();
//            if ("ENTER".equals(console.readLine("\nTYPE ACTION:").toUpperCase())) {
            if ("ENTER".equals(action.toUpperCase())) {
                for (Room room : roomList) {
                    //Updating the location of the player with the curRoom
                    player.getStatus().put("LOCATION", room.getClassName().value());
                    //Clear screen every time the player enters a new room
                    clearScreen();
                    //Display customized roomMessage as you enter the room
                    System.out.println("\n" + room.getMessage());
                    //Display player status which includes their location and score
                    System.out.println("\nSTATUS: " + player.getStatus());
                    //Display action options available to the player
                    System.out.println("ACTIONS: " + room.getActions());
                    //Direct to the proper room actions interaction
                    actionInteraction(room, player, scanner);
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
    private Player getPlayer(Scanner scanner) {
        String playerName;
        Player curPlayer;
        while (true) {
            System.out.println("\nWHAT IS YOUR NAME?: ");
            String answer=scanner.nextLine();
            playerName = answer;

//            playerName = console.readLine("\nWHAT IS YOUR NAME?: ");
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
    private void actionInteraction(Room room, Player player, Scanner scanner) {
        switch (room.getClassName()) {
            case LOBBY:
                gameHelperScanner.lobbyAction(room, player, scanner);
                break;
            case JAVA:
            case JAVASCRIPT:
            case ALGORITHM:
            case LINUX:
            case PYTHON:
            case CAPSTONE:
                gameHelperScanner.classActions(room, player, scanner);
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
