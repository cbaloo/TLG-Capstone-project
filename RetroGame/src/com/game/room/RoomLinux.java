package com.game.room;

import com.game.accesory.MessageArt;
import com.game.accesory.*;
import com.game.person.Instructor;

import java.util.*;

public class RoomLinux extends Room {
    //CONSTRUCTOR
    public RoomLinux() {
        super();
        setClassName(ClassName.LINUX);
        setInstructor(new Instructor("JOHN"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return Message.getMessageLinux();
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
        return Actions.getActionsLinux();
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
