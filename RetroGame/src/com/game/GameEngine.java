package com.game;

import com.game.person.Player;

import java.io.Console;

public class GameEngine {
    public Player player;
    public  Console console=System.console();

    //Method to start the game
    public void start(){
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
        displayWelcomeMsg(player.getName());
        //TODO Display the map of floor of TLG displayMap() Chandana
>>>>>>> 9f3e4de090f3c6841c08ccd930b41b2b86382374

        //TODO Game loop starts once the player opts to ENTER
        while(true){
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

    public void enterRoom(){
        return;
    }
<<<<<<< HEAD
=======
    //Display player status
    public void displayStatus(){

    }
    //Display room message
    public void displayRoomMessage(){

    }

    //Display map function
    public void displayMap(){

    }
>>>>>>> 28a7e281508491379edfbc8c77f25b962d873bc8


}
