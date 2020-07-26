package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.IceBreaker;
import com.game.question.Quiz;
import com.game.question.WildCard;

import java.util.*;

public class RoomLinux extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------" +
            "\nWELCOME TO THE LINUX CLASSROOM!";
    private List<String> actions = new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    //CONSTRUCTOR
    public RoomLinux() {
        super();
        setClassName(ClassName.LINUX);
        setInstructor(new Instructor("JOHN"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override

    public Map<String, String> getQuiz() {
        return Quiz.getQuizLinux();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardLinux();
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
        MessageArt.mapLinux();
    }

    @Override
    public String toString() {
        return "RoomLinux{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
