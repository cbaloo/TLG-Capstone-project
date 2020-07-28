package com.game.room;

import com.game.accesory.MessageArt;
import com.game.accesory.*;
import com.game.person.Instructor;

import java.util.*;

public class RoomJava extends Room {
    //CONSTRUCTOR
    public RoomJava() {
        super();
        setClassName(ClassName.JAVA);
        setInstructor(new Instructor("JAY"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return Message.getMessageJava();
    }
    @Override
    public List<String> getActions() {
        return Actions.getActionsJava();
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
