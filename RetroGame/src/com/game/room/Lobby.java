package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;
import com.game.question.*;

import java.util.*;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private String message="--------------------------------------------"+
            "\nJEANNETTE WELCOMES YOU AND LET YOU KNOW THAT THE FIRST CALSS YOU WILL ATTEND IS JAVA";
    //action options in this particular room
    private List<String> actions=new ArrayList(Arrays.asList(
       "ENTER JAVA(J)"
    ));

    //CONSTRUCTOR
    public Lobby() {
        super();
        setClassName(ClassName.LOBBY);
        setInstructor(new Instructor("JEANNETTE"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
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
        return actions;
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
