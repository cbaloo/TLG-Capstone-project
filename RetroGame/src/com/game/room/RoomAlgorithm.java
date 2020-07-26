package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.IceBreaker;
import com.game.question.Quiz;
import com.game.question.WildCard;

import java.util.*;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE ALGORITHMS CLASSROOM!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    //CONSTRUCTOR
    public RoomAlgorithm() {
        super();
        setClassName(ClassName.ALGORITHM);
        setInstructor(new Instructor("TOM"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override

    public Map<String, String> getQuiz() {
        return Quiz.getQuizAlgorithm();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardAlgorithm();
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
        MessageArt.mapAlgo();
    }

    @Override
    public String toString() {
        return "RoomAlgorithm{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }

}
