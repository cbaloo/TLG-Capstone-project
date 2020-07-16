package com.game.room;

import com.game.person.Instructor;

public class RoomCapstone extends Room {
    //CONSTRUCTOR
    public RoomCapstone(){
        super();
        setName(Name.CAPSTONE);
        setInstructor(new Instructor("Rennie"));
    }

    @Override
    public String toString() {
        return "RoomCapstone{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
