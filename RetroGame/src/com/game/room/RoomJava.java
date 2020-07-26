package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.IceBreaker;
import com.game.question.Quiz;
import com.game.question.WildCard;

import java.util.*;

public class RoomJava extends Room {

    //INSTANCE VARIABLES
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE JAVA CLASSROOM. " +
            "I HOPE YOU BROUGHT YOUR AIR GUITAR WITH YOU!\n"+
            "JAY IS IN CHARGE NOW, SO YOU BETTER PAY ATTENTION.";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
//            "TAKE BREAK(B)"

    ));

    //CONSTRUCTOR
    public RoomJava() {
        super();
        setClassName(ClassName.JAVA);
        setInstructor(new Instructor("JAY"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public List<String> getActions() {
        return actions;
    }

    @Override
    public Map<String, String> getQuiz() {
        return Quiz.getQuizJava();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardJava();
    }

    @Override
    public String getIceBreaker() {
        return IceBreaker.getIceBreaker();
    }

    @Override
    public void printMap() {
        MessageArt.mapJava();
    }

    @Override
    public String toString() {
        return "RoomJava{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
