package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.IceBreaker;
import com.game.question.Quiz;
import com.game.question.WildCard;

import java.util.*;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------"+
            "\nWELCOME TO JAVASCRIPT! ARE YOU CONFUSED YET??";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    //CONSTRUCTOR
    public RoomJS() {
        super();
        setClassName(ClassName.JAVASCRIPT);
        setInstructor(new Instructor("PETER"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override

    public Map<String, String> getQuiz() {
        return Quiz.getQuizJS();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardJS();
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
        MessageArt.mapJS();
    }

    @Override
    public String toString() {
        return "RoomJavaScript{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
