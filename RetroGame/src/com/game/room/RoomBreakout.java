package com.game.room;

import com.game.person.Instructor;

public class RoomBreakout extends Room {
    //INSTANCE VARIABLE
    private String roomMessage = "Welcome to the Breakout Room! " +
            "You have wasted your own time, " +
            "but here is a red marker for your entertainment! ";

    //CONSTRUCTOR
    public RoomBreakout() {
        super();
        setName(Name.BREAKOUT);
        setInstructor(new Instructor("CHAOS"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomBreakout{" +
                "name=" + getName() + ", " +
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
