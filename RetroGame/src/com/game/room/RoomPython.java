package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE PYTHON CLASSROOM!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("WHITE SPACES ARE THE LEAST OF OUR WORRIES WHILE CODING IN PYTHON? (TRUE/FALSE)", "FALSE");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("WE WERE IS SOME KIND OF GANG WHILE WE WERE GOING THROUGH THE PYTHON COURSE?(TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LIVES CLOSEST TO MOUNT RAINIER","BRAD");
        }
    };
    //CONSTRUCTOR
    public RoomPython(){
        super();
        setClassName(ClassName.PYTHON);
        setInstructor(new Instructor("ZACH"));
    }

    //ACCESSOR METHOD
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
        return "RoomPython{" +
                "name=" + getClassName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
