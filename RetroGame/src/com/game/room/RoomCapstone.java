package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomCapstone extends Room {
    //INSTANCE VARIABLE
    private String message = "Welcome to the Capstone classroom! You are almost worthy!!";

    private Map<String, String> roomQuiz = new HashMap<>() {
        {
            put("How many principles does Agile have?", "12");
            put("In Agile, the highest priority is to satisfy the '--------'.", "customer");
            put("A user story is a tool used in '-----' software development", "agile");
            put("When using Agile, sprints typically last between 1 and 4 '-----'.", "weeks");
            put("Working software is the primary measure of '--------'?", "");
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
    public String toString() {
        return "RoomCapstone{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
