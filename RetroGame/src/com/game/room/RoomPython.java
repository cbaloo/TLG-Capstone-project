package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.IceBreaker;
import com.game.question.Quiz;
import com.game.question.WildCard;

import java.util.*;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------" +
            "\nWELCOME TO THE PYTHON CLASSROOM!";
    private List<String> actions = new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));


    //CONSTRUCTOR
    public RoomPython() {
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
        return Quiz.getQuizPython();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardPython();
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
        MessageArt.mapPython();
    }

    @Override
    public String toString() {
        return "RoomPython{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
