package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomJava extends Room {

    //INSTANCE VARIABLES
    private String message = "--------------------------------------------" +
            "\nWELCOME TO THE JAVA CLASSROOM. " +
            "I HOPE YOU BROUGHT YOUR AIR GUITAR WITH YOU!";
    private List<String> actions = new ArrayList(Arrays.asList(
            "TAKE QUIZ",
            "TAKE WILD CARD QUIZ"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("WHAT DOES OOP STAND FOR?", "OBJECT ORIENTED PROGRAMMING");
            put("WHAT DOES JVM STAND FOR?", "JAVA VIRTUAL MACHINE");
            put("JAVA USES THE 'PUBLIC', 'PROTECTED,' AND '-------' ACCESS KEYWORDS.", "PRIVATE");
            put("IF YOU DECLARE NO CONSTRUCTORS, A '-------' CONSTRUCTOR IS AUTOMATICALLY ASSIGNED.", "DEFAULT");
            put("WHAT DOES THE '!=' OPERATOR STAND FOR?", "NOT EQUAL");
            put("WHAT IDE DID WE PRIMARILY USE DURING OUR JAVA COURSE?", "INTELLIJ");
        }
    };

    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("DID JAY WIN FIRST PLACE IN HIS AIR GUITAR COMPETITION? (TRUE/FALSE)", "FALSE");
        }
    };

    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("JAY"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public List<String> getActions() {
        return actions;
    }

    @Override
    public void setActions(List<String> actions) {
        this.actions = actions;
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
    public String toString() {
        return "RoomJava{" +
                "name=" + getName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
