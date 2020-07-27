package com.game.room;

import com.game.accesory.MessageArt;
import com.game.accesory.*;
import com.game.person.Instructor;

import java.util.*;

public class RoomAlgorithm extends Room {
    //CONSTRUCTOR
    public RoomAlgorithm() {
        super();
        setClassName(ClassName.ALGORITHM);
        setInstructor(new Instructor("TOM"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return Message.getMessageAlgorithm();
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
        return Actions.getActionsAlgorithm();
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
