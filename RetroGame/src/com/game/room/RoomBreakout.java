package com.game.room;

import com.game.person.Instructor;

public class RoomBreakout extends Room {
    //CONSTRUCTOR
    public RoomBreakout(){
        super();
        setName(Name.BREAKOUT);
        setInstructor(new Instructor("CHAOS"));
    }

    @Override
    public String toString() {
        return "RoomBreakout{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
