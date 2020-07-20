package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomCapstone extends Room {
    //INSTANCE VARIABLE
    private String message = "Welcome to the Capstone classroom! You are almost worthy!!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take quiz",
            "Take wild card quiz"
    ));


    private Map<String, String> roomQuiz = new HashMap<>() {
        {
            put("How many principles does Agile have?", "12");
            put("In Agile, the highest priority is to satisfy the '--------'.", "customer");
            put("A user story is a tool used in '-----' software development", "agile");
            put("When using Agile, sprints typically last between 1 and 4 '-----'.", "weeks");
            put("Working software is the primary measure of '--------'?", "");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("Question? (true/false)", "false");

        }
    };

    //CONSTRUCTOR
    public RoomCapstone() {
        super();
        setName(Name.CAPSTONE);
        setInstructor(new Instructor("Rennie"));
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
        return "RoomCapstone{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
