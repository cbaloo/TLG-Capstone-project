package com.game.room;

import com.game.person.Instructor;

public class RoomAlgorithm extends Room {
    //CONSTRUCTOR
    public RoomAlgorithm(){
        super();
        setName(Name.ALGORITHM);
        setInstructor(new Instructor("Tom"));
    }


    @Override
    public String toString() {
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }

}
