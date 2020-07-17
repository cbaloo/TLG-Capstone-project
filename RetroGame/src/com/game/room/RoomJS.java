package com.game.room;

import com.game.person.Instructor;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String roomMessage = "Welcome to JavaScript! Are you confused yet??";

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
