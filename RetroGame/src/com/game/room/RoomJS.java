package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String message = "Welcome to JavaScript! Are you confused yet??";

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("Which company developed JavaScript, Netgear or Netscape?", "netscape");
            put("JavaScript can be used with CSS and '----' to create interactive web pages.", "html");
            put("JavaScript was first known as LiveScript or ECMAScript?", "livescript");
            put("In JavaScript, semi-colons are required", "false");
            put("JSON stands for JavaScript Object '--------'", "notation");
            put("", "");
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
        return null;
    }

    @Override
    public List<String> getActions() {
        return null;
    }

    @Override
    public String toString() {
        return "RoomJavaScript{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
