package com.game.room;

import com.game.accesory.MessageArt;
import com.game.accesory.*;
import com.game.person.Instructor;

import java.util.*;

public class RoomPython extends Room {
    //CONSTRUCTOR
    public RoomPython() {
        super();
        setClassName(ClassName.PYTHON);
        setInstructor(new Instructor("ZACH"));
    }

    //ACCESSOR METHOD
    @Override
    public String getMessage() {
        return Message.getMessagePython();
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
        return Actions.getActionsPython();
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
