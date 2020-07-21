package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE ALGORITHMS CLASSROOM!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("A SET CAN HAVE DUPLICATES?(TRUE/FALSE)", "FALSE");
        }
    };
    private Map<String,String> wildCardQuiz=new HashMap<>(){
        {
            put("TOM IS A MAN OF MAN OF MANY TALENTS? (TRUE/FALSE)", "TRUE");
            put("STEVE CAN DO NO WRONG?? (TRUE/FALSE)", "TRUE");
        }
    };

    //CONSTRUCTOR
    public RoomAlgorithm() {
        super();
        setName(Name.ALGORITHM);
        setInstructor(new Instructor("TOM"));
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
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }

}
