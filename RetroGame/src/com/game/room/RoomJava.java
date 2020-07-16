package com.game.room;

import com.game.person.Instructor;

public class RoomJava extends Room {
    //INSTANCE VARIABLES
    private String javaMessage="You are now in the Java Classroom!";

    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("Jay") );
    }

    //ACCESSOR METHODS
    public String getJavaMessage() {
        return javaMessage;
    }

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}