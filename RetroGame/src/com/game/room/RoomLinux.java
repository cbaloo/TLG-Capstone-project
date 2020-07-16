package com.game.room;

import com.game.person.Instructor;

public class RoomLinux extends Room {
    //CONSTRUCTOR
    public RoomLinux(){
        super();
        setName(Name.LINUX);
        setInstructor(new Instructor("John"));
    }

    @Override
    public String toString() {
        return "RoomLinux{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}