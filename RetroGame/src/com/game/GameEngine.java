package com.game;

import java.io.Console;

public class GameEngine {
    public Player player;
    public  Console console=System.console();

    //Method to start the game
    public void start(){
        Player player=getPlayer();
        System.out.println(player);

    }


    //Get player name from the console and then return a Player
    public Player getPlayer(){
        String playerName;
        while(true){
            playerName=console.readLine("What do you want your name to be: ");
            if(!playerName.isEmpty()){
                return new Player(playerName);
            }
        }
    }




}
