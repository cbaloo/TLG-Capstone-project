package com.game.room;

import com.game.person.Instructor;

public class RoomJava extends Room {

    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("Jay") );
    }


    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
