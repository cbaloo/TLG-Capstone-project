package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomLinux extends Room {
    //INSTANCE VARIABLES
    private String message = "Welcome to the Linux Classroom!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take java quiz",
            "Take wild card quiz"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("What is the Linux command to change directories?", "cd");
            put("What is the Linux command to list the contents of a directory?", "ls");
            put("What is the Linux command to make a directory?", "mkdir");
            put("", "");
            put("", "");
        }
    };


    //CONSTRUCTOR
    public RoomLinux(){
        super();
        setName(Name.LINUX);
        setInstructor(new Instructor("John"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getQuiz() {
        return roomQuiz;
    }

    @Override
    public Map<String, String> getWildcard() {
        return null;
    }

    @Override
    public List<String> getActions() {
        return null;
    }

    @Override
    public void setActions(List<String> actions) {
        this.actions=actions;
    }

    @Override
    public String toString() {
        return "RoomLinux{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
