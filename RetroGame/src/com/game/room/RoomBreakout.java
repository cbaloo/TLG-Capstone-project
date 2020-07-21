package com.game.room;

import com.game.person.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RoomBreakout extends Room {
    //INSTANCE VARIABLE
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE BREAKOUT ROOM! " +
            "YOU HAVE WASTED YOUR OWN TIME, " +
            "BUT HERE IS A RED MARKER FOR YOUR ENTERTAINMENT! ";
    private List<String> actions=new ArrayList(Arrays.asList(
            "WASTE TIME",
            "COMPLAIN"
    ));

    //CONSTRUCTOR
    public RoomBreakout() {
        super();
        setClassName(ClassName.BREAKOUT);
        setInstructor(new Instructor("CHAOS"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    //BREAKOUT DOES NOT HAVE QUIZ FOR NOW
    @Override
    public Map<String, String> getQuiz() {
        return null;
    }
    //BREAKOUT DOES NOT HAVE WILD CARD FOR NOW
    @Override
    public Map<String, String> getWildcard() {
        return null;
    }

    @Override
    public List<String> getActions() {
        return actions;
    }

    @Override
    public void setActions(List<String> actions) {
        this.actions=actions;
    }

    @Override
    public String toString() {
        return "RoomBreakout{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
