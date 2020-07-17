package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomJava extends Room {

    //INSTANCE VARIABLES
    public String roomMessage = "Welcome to the Java Classroom. " +
            "I hope you brought your air guitar with you!";

    private List<String> actions=new ArrayList(Arrays.asList(
            "Introduce yourself",
            "Wave",
            "Take quiz"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
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
    public String getRoomMessage() {
        return roomMessage;
    }

    public List<String> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getName() + ", " +
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
