package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.Map;

public class RoomLinux extends Room {
    //INSTANCE VARIABLES
    private String roomMessage = "Welcome to the Linux Classroom!";

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("","");
            put("","");
            put("","");
            put("","");
            put("","");
            put("","");


        }
    };


    //CONSTRUCTOR
    public RoomLinux(){
        super();
        setName(Name.LINUX);
        setInstructor(new Instructor("John"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomLinux{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
