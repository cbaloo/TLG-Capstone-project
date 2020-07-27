package com.game.room;

import com.game.accesory.MessageArt;
import com.game.accesory.*;
import com.game.person.Instructor;

import java.util.*;

public class RoomCapstone extends Room {
    //CONSTRUCTOR
    public RoomCapstone() {
        super();
        setClassName(ClassName.CAPSTONE);
        setInstructor(new Instructor("RENNIE"));
    }


    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return Message.getMessageCapstone();
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
        return Actions.getActionsCapstone();
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
