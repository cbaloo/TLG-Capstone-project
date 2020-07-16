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
    public Lobby curRoom;
    public List<Room> roomList=new ArrayList(Arrays.asList(
            new Lobby(),
            new RoomJava(),
            new RoomJS(),
            new RoomLinux(),
            new RoomAlgorithm(),
            new RoomPython(),
            new RoomCapstone()
    ));

    //Method to start the game
    public void start(){
        Player player= getPlayer();
        //TODO Display Welcome message(with name) and Game Intro, displayIntro() maybe, actions displayed eg, [ENTER]
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana

        //TODO Game loop starts once the player opts to ENTER
        if("ENTER".equals(console.readLine("Type action:").toUpperCase())){
            System.out.println("In the Lobby!");
//            curRoom= new Lobby();
//            curRoom.action.put(curRoom.getName().value(),true);
//            System.out.println(curRoom.getStaff());

            while(true){
                //TODO once in the lobby message,actions and status displayed, only java and breakout is open for entry, all others are closed with a  smart-ass comment
                //TODO once inside java, Jay greets you the jay way, Maybe icebreaker in the beginning and then on to quiz, maybe make the presence of classmates and Jeanette known somehow
                //TODO pass/stuck-in-java after quiz, if pass python opens and the same pattern follows, go to lobby and then to python
            }
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
    public void displayRoomMessage(){

    }

    //Display map function
    public void displayMap(){

    }


}
