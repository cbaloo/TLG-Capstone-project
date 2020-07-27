package com.game.room;

import com.game.accesory.MessageArt;
import com.game.accesory.*;
import com.game.person.Instructor;

import java.util.*;

public class RoomJS extends Room {
    //CONSTRUCTOR
    public RoomJS() {
        super();
        setClassName(ClassName.JAVASCRIPT);
        setInstructor(new Instructor("PETER"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return Message.getMessageJS();
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
        return Actions.getActionsJS();
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
