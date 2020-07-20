package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomJava extends Room {

    //INSTANCE VARIABLES
    private String message = "Welcome to the Java Classroom. " +
            "I hope you brought your air guitar with you!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Take quiz",
            "Take wild card quiz"
    ));

    private Map<String,String> quiz =new HashMap<>(){
        {
            put("What does OOP stand for?", "object oriented programming");
            put("What does JVM stand for?","java virtual machine");
            put("Java uses the 'public', 'protected,' and '-------' access keywords.","private");
            put("If you declare no constructors, a '-------' constructor is automatically assigned.","default");
            put("What does the '!=' operator stand for?","not equal");
            put("What IDE did we primarily use during our Java course?","intellij");
        }

    };

    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("Did Jay win first place in his air guitar competition? (true/false)", "false");

        }
    };


    //CONSTRUCTOR
    public RoomJava() {
        super();
        setName(Name.JAVA);
        setInstructor(new Instructor("Jay"));
    }

    //ACCESSOR METHODS
    public String getMessage() {
        return message;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        //TODO May need validation
        this.actions = actions;
    }

    public Map<String, String> getQuiz() {
        return quiz;
    }

    public Map<String, String> getWildcard() {
        return wildCardQuiz;
    }

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName() + ", " +
                getInstructor() + "\n" +
                getMessage() +" } ";
    }
}
