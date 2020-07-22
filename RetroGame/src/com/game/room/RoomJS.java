package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------"+
            "\nWELCOME TO JAVASCRIPT! ARE YOU CONFUSED YET??";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String,String> quiz =new HashMap<>(){
        {
            put("WHICH COMPANY DEVELOPED JAVASCRIPT, NETGEAR OR NETSCAPE?", "NETSCAPE");
            put("JAVASCRIPT CAN BE USED WITH CSS AND '----' TO CREATE INTERACTIVE WEB PAGES.", "HTML");
            put("JAVASCRIPT WAS FIRST KNOWN AS LIVESCRIPT OR ECMASCRIPT?", "LIVESCRIPT");
            put("IN JAVASCRIPT, SEMI-COLONS ARE REQUIRED (TRUE/FALSE)", "FALSE");
            put("JSON STANDS FOR JAVASCRIPT OBJECT '--------'", "NOTATION");

        }
    };

    private Map<String, String> wildCardQuiz=new HashMap<>(){
        {
        put("HOW MANY INSTRUCTORS DID WE HAVE FOR OUR JAVASCRIPT COURSE?(1/2)","2");
        put("CLASSMATE WHO RELOCATES TO DIFFERENT ROOMS/AREA OF HIS/HER HOME FOR CLASS?","DAEUN");
        }
    };

    //CONSTRUCTOR
    public RoomJS(){
        super();
        setClassName(ClassName.JAVASCRIPT);
        setInstructor(new Instructor("NELLY"));
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
        return "RoomJavaScript{" +
                "name=" + getClassName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
