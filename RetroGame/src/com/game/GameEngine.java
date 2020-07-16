package com.game;

import com.game.person.Player;
import com.game.room.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.LoggingPermission;

public class GameEngine {
    public Player player;
    public  Console console=System.console();
    public Lobby curRoom;
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
<<<<<<< HEAD
        Player player= getPlayer();
        //TODO Display Welcome message(with name) and Game Intro, displayIntro() maybe, actions displayed eg, [ENTER]
=======
<<<<<<< HEAD
        Player player=getPlayer();
        //System.out.println(player);
        //TODO Display Welcome message(with name) and Game Intro, displayIntro() maybe, actions displayed eg, [ENTER]
<<<<<<< HEAD
<<<<<<< HEAD
=======
        //TODO Display the map of floor of TLG displayMap() Chandana
        displayWelcomeMsg(player.getName());
>>>>>>> 28a7e281508491379edfbc8c77f25b962d873bc8
=======
=======
        Player player= getPlayer();
>>>>>>> c04b7d5b747c09aeae674d7a3610d850785223b7
>>>>>>> master
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana

        //TODO Game loop starts once the player opts to ENTER
<<<<<<< HEAD
        if("ENTER".equals(console.readLine("Type action:").toUpperCase())){
            System.out.println("In the Lobby!");
            while(true){
                //TODO once in the lobby message,actions and status displayed, only java and breakout is open for entry, all others are closed with a  smart-ass comment
                //TODO once inside java, Jay greets you the jay way, Maybe icebreaker in the beginning and then on to quiz, maybe make the presence of classmates and Jeanette known somehow
                //TODO pass/stuck-in-java after quiz, if pass python opens and the same pattern follows, go to lobby and then to python
            }
=======
<<<<<<< HEAD
        while(true){
            //TODO once in the lobby message,actions and status displayed, only java and breakout is open for entry, all others are closed with a  smart-ass comment
            //TODO once inside java, Jay greets you the jay way, Maybe icebreaker in the beginning and then on to quiz, maybe make the presence of classmates and Jeanette known somehow
            //TODO pass/stuck-in-java after quiz, if pass python opens and the same pattern follows, go to lobby and then to python
=======
        if("ENTER".equals(console.readLine("Type action:").toUpperCase())){
            for(Room curRoom:roomList){
                curRoom.action.put(curRoom.getName().value(),true);
                player.getStatus().put("Location",curRoom.getName().value());
                System.out.println(player.getStatus());
                if(curRoom.getName().value().equals("Lobby")){
                    Lobby lobby=(Lobby) curRoom;
                    System.out.println(lobby.getStaff().getName()+": Gooooood Morning! How are you " + player.getName()+" ?");
                }
                else{
                    System.out.println(curRoom.getInstructor().getName()+": How are you "+player.getName()+ " ?");

                }
            }
                //TODO once in the lobby message,actions and status displayed, only java and breakout is open for entry, all others are closed with a  smart-ass comment
                //TODO once inside java, Jay greets you the jay way, Maybe icebreaker in the beginning and then on to quiz, maybe make the presence of classmates and Jeanette known somehow
                //TODO pass/stuck-in-java after quiz, if pass python opens and the same pattern follows, go to lobby and then to python

>>>>>>> c04b7d5b747c09aeae674d7a3610d850785223b7
>>>>>>> master
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
    public void enterRoom(){
        return;
=======
>>>>>>> master
    //Display Welcome message and give a rundown of how to play the game
    public void displayWelcomeMsg(String name){
        System.out.println("\n\nHEY "+name.toUpperCase()+"! \n\nWELCOME TO THE TLG LEARNING FACILITY IN BELLEVUE, WA!\nCONGRATULATIONS!!! YOU ARE A BRAND SPANKING NEW SDE APPRENTICE. BE READY FOR AN EXCITING RIDE TO AMAZON. \n\nWARNING!!! BEFORE ENTERING BUCKLE UP WITH LOADS OF ENTHUSIASM. TO GET TO OJT YOU HAVE TO GO THROUGH THE GATEKEEPERS: TLG INSTRUCTORS AND STAFF.\n\nGOOD LUCK AND GODSPEED.\n\nACTIONS:[ENTER,]");
    }

<<<<<<< HEAD
    //Display available actions to the player
    public void displayActions(){

=======
    //Update player status
    public void updateStatus(){

    }

    //Display available actions to the player
    public void displayActions(){

>>>>>>> c04b7d5b747c09aeae674d7a3610d850785223b7
>>>>>>> master
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