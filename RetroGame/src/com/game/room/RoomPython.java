package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String message = "WELCOME TO THE PYTHON CLASSROOM!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ",
            "TAKE WILD CARD QUIZ"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("WHITE SPACES ARE THE LEAST OF OUR WORRIES WHILE CODING IN PYTHON? (TRUE/FALSE)", "FALSE");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("WE WERE IS SOME KIND OF GANG WHILE WE WERE GOING THROUGH THE PYTHON COURSE?(TRUE/FALSE)", "TRUE");
        }
    };
    //CONSTRUCTOR
    public RoomPython(){
        super();
        setName(Name.PYTHON);
        setInstructor(new Instructor("ZACH"));
    }

    //ACCESSOR METHOD
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
        return "RoomPython{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
