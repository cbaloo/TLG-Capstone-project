package com.game.room;

import com.game.accesory.MessageArt;
import com.game.person.Instructor;
import com.game.accesory.*;

import java.util.*;

public class Lobby extends Room {

    //CONSTRUCTOR
    public Lobby() {
        super();
        setClassName(ClassName.LOBBY);
        setInstructor(new Instructor("JEANNETTE"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return Message.getMessageLobby();
    }

    @Override
    public Map<String, String> getQuiz() {
        return Quiz.getQuizLobby();
    }

    @Override
    public Map<String, String> getWildcard() {
        return WildCard.getWildCardLobby();
    }

    @Override
    public String getIceBreaker() {
        return IceBreaker.getIceBreaker();
    }

    @Override
    public List<String> getActions() {
        return Actions.getActionsLobby();
    }

    @Override
    public void printMap() {
        MessageArt.mapLobby();
    }

    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "} ";
    }
}
