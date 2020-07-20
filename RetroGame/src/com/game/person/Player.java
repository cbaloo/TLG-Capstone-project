package com.game.person;

import java.util.HashMap;
import java.util.Map;

public class Player extends Person {
    //INSTANCE VARIABLE
    private Map<String,String> status=new HashMap<>(){
        {
            put("LOCATION", "LOBBY");
            put("SCORE","0");
        }
    };

    //CONSTRUCTORS
    public Player(String name) {
        super(name);
        setTitle(Title.PLAYER);
    }

    //ACCESSOR METHODS
    public Map<String, String> getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + getName() +
                ", title= " + getTitle() +
                ", status= "+getStatus()+
                '}';
    }
}
