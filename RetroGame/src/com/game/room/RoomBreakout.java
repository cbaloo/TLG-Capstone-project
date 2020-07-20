package com.game.room;

import com.game.person.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class RoomBreakout extends Room {
    //INSTANCE VARIABLE
    private String message = "Welcome to the Breakout Room! " +
            "You have wasted your own time, " +
            "but here is a red marker for your entertainment! ";
    private List<String> actions=new ArrayList(Arrays.asList(
            "Waste time",
            "Complain"
    ));

    //CONSTRUCTOR
    public RoomBreakout() {
        super();
        setName(Name.BREAKOUT);
        setInstructor(new Instructor("CHAOS"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getRoomQuiz() {
        return null;
    }

    @Override
    public Map<String, String> getWildcard() {
        return null;
    }

    @Override
    public List<String> getActions() {
        return null;
    }

    @Override
    public void setActions(List<String> actions) {
        this.actions=actions;
    }

    @Override
    public String toString() {
        return "RoomBreakout{" +
                "name=" + getName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
