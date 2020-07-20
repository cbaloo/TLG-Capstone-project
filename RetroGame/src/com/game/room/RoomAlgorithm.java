package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String message = "Welcome to the Algorithms Classroom!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take quiz",
            "Take wild card quiz"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("A set can have duplicates?(True/False)", "False");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("Tom is a man of man of many talents? (true/false)", "True");
            put("Steve can do no wrong?? (true/false)", "true");
        }
    };

    //CONSTRUCTOR
    public RoomAlgorithm() {
        super();
        setName(Name.ALGORITHM);
        setInstructor(new Instructor("Tom"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getQuiz() {
        return quiz;
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
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }

}
