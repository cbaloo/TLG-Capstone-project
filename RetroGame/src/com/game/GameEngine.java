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

        //TODO Game loop starts once the player opts to ENTER
        while(true){


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




}
