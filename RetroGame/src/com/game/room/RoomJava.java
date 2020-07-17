package com.game.room;

import com.game.person.Instructor;

public class RoomJava extends Room {

    //INSTANCE VARIABLES
    private String message="";


    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("Jay") );
    }


    //ACCESSOR METHODS

    public String getMessage() {
        return message;
    }

>>>>>>> 28a7e281508491379edfbc8c77f25b962d873bc8

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
