package com.game.room;

import com.game.person.Instructor;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String roomMessage = "Welcome to the Python Classroom!";

    //CONSTRUCTOR
    public RoomPython(){
        super();
        setName(Name.PYTHON);
        setInstructor(new Instructor("Zach"));
    }

    //ACCESSOR METHOD
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomPython{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
