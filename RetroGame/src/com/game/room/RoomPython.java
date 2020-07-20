package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String message = "Welcome to the Python Classroom!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take quiz",
            "Take wild card quiz"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("White spaces are the least of our worries while coding in python? (True/False)", "False");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("We were is some kind of gang while we were going through the python course?(True/False)", "True");
        }
    };
    //CONSTRUCTOR
    public RoomPython(){
        super();
        setName(Name.PYTHON);
        setInstructor(new Instructor("Zach"));
    }

    //ACCESSOR METHOD
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
        return "RoomPython{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
