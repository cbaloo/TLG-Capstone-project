package com.game;

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
