package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomJava extends Room {

    //INSTANCE VARIABLES
    public String roomMessage = "Welcome to the Java Classroom. " +
            "I hope you brought your air guitar with you!";
    //TODO quiz question repo
    private Map<String,String> roomQuiz=new HashMap<>();
    private List<String> actions=new ArrayList(Arrays.asList(
            "Introduce yourself",
            "Wave",
            "Take quiz"
    ));


    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("Jay"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    public List<String> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName() + ", " +
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
