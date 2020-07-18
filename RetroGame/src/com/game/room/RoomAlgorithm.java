package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String message = "Welcome to the Algorithms Classroom!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take java quiz",
            "Take wild card quiz"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("", "");
            put("", "");
            put("", "");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("Did Jay win first place in his air guitar competition? (true/false)", "false");

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
        return null;
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
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }

}
