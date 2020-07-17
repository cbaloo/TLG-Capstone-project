package com.game.room;

import com.game.person.Instructor;

public class RoomCapstone extends Room {
    //INSTANCE VARIABLE
    private String roomMessage = "Welcome to the Capstone classroom! You are almost worthy!!";

    //CONSTRUCTOR
    public RoomCapstone(){
        super();
        setName(Name.CAPSTONE);
        setInstructor(new Instructor("Rennie"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomCapstone{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
