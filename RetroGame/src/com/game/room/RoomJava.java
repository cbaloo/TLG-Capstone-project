package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.Map;

public class RoomJava extends Room {
    //INSTANCE VARIABLES
    private String message="";
    //TODO quiz question repo
    private Map<String,String> roomQuiz=new HashMap<>();

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


    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
