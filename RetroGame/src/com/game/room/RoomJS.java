package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.Map;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String roomMessage = "Welcome to JavaScript! Are you confused yet??";

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("Which company developed JavaScript, Netgear or Netscape?", "netscape");
            put("","");
            put("","");
            put("","");
            put("","");
            put("","");
        }
    };

    //CONSTRUCTOR
    public RoomJS(){
        super();
        setName(Name.JAVASCRIPT);
        setInstructor(new Instructor("Nelly"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomJavaScript{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
