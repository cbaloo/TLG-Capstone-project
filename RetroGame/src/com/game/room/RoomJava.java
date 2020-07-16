package com.game.room;

import com.game.person.Instructor;

public class RoomJava extends Room {
     private String message = "";

    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("Jay") );
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
