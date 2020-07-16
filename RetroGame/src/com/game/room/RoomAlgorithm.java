package com.game.room;

import com.game.person.Instructor;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String roomMessage = "Welcome to the Algorithms Classroom!";

    //CONSTRUCTOR
    public RoomAlgorithm(){
        super();
        setName(Name.ALGORITHM);
        setInstructor(new Instructor("Tom"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }

}
