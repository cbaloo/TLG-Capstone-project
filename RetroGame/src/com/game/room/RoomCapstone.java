package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomCapstone extends Room {
    //INSTANCE VARIABLE
    private String message = "WELCOME TO THE CAPSTONE CLASSROOM! YOU ARE ALMOST WORTHY!!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ",
            "TAKE WILD CARD QUIZ"
    ));


    private Map<String, String> roomQuiz = new HashMap<>() {
        {
            put("HOW MANY PRINCIPLES DOES AGILE HAVE?", "12");
            put("IN AGILE, THE HIGHEST PRIORITY IS TO SATISFY THE '--------'.", "CUSTOMER");
            put("A USER STORY IS A TOOL USED IN '-----' SOFTWARE DEVELOPMENT", "AGILE");
            put("WHEN USING AGILE, SPRINTS TYPICALLY LAST BETWEEN 1 AND 4 '-----'.", "WEEKS");
            put("WORKING SOFTWARE IS THE PRIMARY MEASURE OF '--------'?", "");
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
        setInstructor(new Instructor("RENNIE"));
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
