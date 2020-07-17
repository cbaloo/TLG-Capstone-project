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
        if("ENTER".equals(console.readLine("\nType action:").toUpperCase())){
//            for(Room room:roomList){
//                while(true){
//                    //Updating the location of the player with the curRoom
//                    player.getStatus().put("Location",room.getName().value());
//                    //Display player status
//                    System.out.println("\nSTATUS: "+player.getStatus());
//                    //Display roomMessage as you enter the room
//                    displayRoomMessage(room);
//                    //Display action options
//
//                    //Player response after reading the status and action options
//                    console.readLine("\nType action:");
//
//                    break;
//                }
//
//            }
            Lobby lobby=new Lobby();
            //Update location of the player with current room
            player.getStatus().put("Location",lobby.getName().value());
            //Display roomMessage as you enter the room
            displayRoomMessage(lobby);
            //Display player status: location and score
            System.out.println("\nSTATUS: "+player.getStatus());
            //Display action options
            System.out.println("ACTIONS: "+lobby.getActions());

            while(true){
                //Player response after reading the status and action options
                String action=console.readLine("\nType action:");
                //Only entrance to RommJava is allowed at this point, all the other rooms are closed
                if(action.toUpperCase().equals("enter java".toUpperCase())){
                    RoomJava roomJava=new RoomJava();
                    player.getStatus().put("Location",roomJava.getName().value());
                    displayRoomMessage(roomJava);
                    System.out.println("\nSTATUS: "+player.getStatus());
                    System.out.println("ACTIONS: "+roomJava.getActions());
                    console.readLine("\nType action:");
                    break;
                }
                else if(action.isEmpty()){
                    System.out.println("Invalid Entry!");
                }
                else if (lobby.getActions().contains(action.toUpperCase())){
                    System.out.println("Tough luck little Grasshopper, you are not worthy of entering this room yet!");
                }
                else{
                    System.out.println("HINT: JAVA!");
                }
            }


                //TODO once in the lobby message,actions and status displayed, only java and breakout is open for entry, all others are closed with a  smart-ass comment
                //TODO once inside java, Jay greets you the jay way, Maybe icebreaker in the beginning and then on to quiz, maybe make the presence of classmates and Jeanette known somehow
                //TODO pass/stuck-in-java after quiz, if pass python opens and the same pattern follows, go to lobby and then to python

        }
    }



    //Get player name from the console and then return a Player
    public Player getPlayer(){
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
    public void displayWelcomeMsg(String name){
        System.out.println("\n\nHEY "+name.toUpperCase()+"! \n\nWELCOME TO THE TLG LEARNING FACILITY IN BELLEVUE, WA!\nCONGRATULATIONS!!! YOU ARE A BRAND SPANKING NEW SDE APPRENTICE. BE READY FOR AN EXCITING RIDE TO AMAZON. \n\nWARNING!!! BEFORE ENTERING BUCKLE UP WITH LOADS OF ENTHUSIASM. TO GET TO OJT YOU HAVE TO GO THROUGH THE GATEKEEPERS: TLG INSTRUCTORS AND STAFF.\n\nGOOD LUCK AND GODSPEED.\n\nACTIONS:[ENTER,]");
    }

    //Update player status
    public void updateStatus(){

    }

    //Display available actions to the player
    public void displayActions(){

    }

    //Display player status
    public void displayStatus(){

    }
    //Display room message
    public void displayRoomMessage(Room room){
        switch(room.getName()){
            case LOBBY:
                System.out.println("\n"+((Lobby) room).getRoomMessage());
                break;
            case JAVA:
                System.out.println("\n"+((RoomJava) room).getRoomMessage());
                break;
            case JAVASCRIPT:
                System.out.println("\n"+((RoomJS) room).getRoomMessage());
                break;
            case ALGORITHM:
                System.out.println("\n"+((RoomAlgorithm) room).getRoomMessage());
                break;
            case PYTHON:
                System.out.println("\n"+((RoomPython) room).getRoomMessage());
                break;
            case LINUX:
                System.out.println("\n"+((RoomLinux) room).getRoomMessage());
                break;
            case CAPSTONE:
                System.out.println("\n"+((RoomCapstone) room).getRoomMessage());
                break;
            case BREAKOUT:
                System.out.println("\n"+((RoomBreakout) room).getRoomMessage());
        }

    }

    //Display map function
    public void displayMap(){

    }

}
