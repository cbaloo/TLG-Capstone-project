package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomLinux extends Room {
    //INSTANCE VARIABLES
    private String message = "WELCOME TO THE LINUX CLASSROOM!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ",
            "TAKE WILD CARD QUIZ"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("What is the Linux command to change directories?", "cd");
            put("What is the Linux command to list the contents of a directory?", "ls");
            put("What is the Linux command to make a directory?", "mkdir");

        }
    };

    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("WAS PHOTOGRAPHY ONE OF JOHN'S OTHER PASSION?(TRUE/FALSE)", "TRUE");
        }
    };


    //CONSTRUCTOR
    public RoomLinux(){
        super();
        setName(Name.LINUX);
        setInstructor(new Instructor("JOHN"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getRooQuiz() {
        return roomQuiz;
    }

    @Override
    public Map<String, String> getWildcard() {
        return wildCardQuiz;
    }

    @Override
    public List<String> getActions() {
        return actions;
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
