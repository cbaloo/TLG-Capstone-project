package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.IceBreaker;
import com.game.question.Quiz;
import com.game.question.WildCard;

import java.util.*;

public class RoomCapstone extends Room {
    //INSTANCE VARIABLE
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE CAPSTONE CLASSROOM! YOU ARE ALMOST WORTHY!!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    //CONSTRUCTOR
    public RoomCapstone() {
        super();
        setClassName(ClassName.CAPSTONE);
        setInstructor(new Instructor("RENNIE"));
    }


    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override

    public Map<String, String> getQuiz() {
        return Quiz.getQuizCapstone();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardCapstone();
    }

    @Override
    public String getIceBreaker() {
        return IceBreaker.getIceBreaker();
    }

    @Override
    public List<String> getActions() {
        return actions;
    }


    @Override
    public void printMap() {
        MessageArt.mapCapstone();
    }

    @Override
    public String toString() {
        return "RoomCapstone{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
