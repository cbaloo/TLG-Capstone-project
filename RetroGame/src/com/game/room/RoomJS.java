package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String message = "Welcome to JavaScript! Are you confused yet??";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take javascript quiz",
            "Take wild card quiz"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("Which company developed JavaScript, Netgear or Netscape?", "netscape");
            put("JavaScript can be used with CSS and '----' to create interactive web pages.", "html");
            put("JavaScript was first known as LiveScript or ECMAScript?", "livescript");
            put("In JavaScript, semi-colons are required", "false");
            put("JSON stands for JavaScript Object '--------'", "notation");
        }
    };

    private Map<String, String> wildCardQuiz=new HashMap<>(){
        {
        put("How many instructors did we have for our Javascript course?(1/2)","2");
        }
    };

    //CONSTRUCTOR
    public RoomJS(){
        super();
        setName(Name.JAVASCRIPT);
        setInstructor(new Instructor("Nelly"));
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
        return "RoomJavaScript{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
