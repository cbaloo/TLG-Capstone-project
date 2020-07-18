package com.game.room;

import com.game.person.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private String message="\n\nYOU ARE IN THE LOBBY AND SEE MANY CLASSROOMS.";
    private List<String> actions=new ArrayList(Arrays.asList(
       "ENTER JAVA",
       "ENTER JAVASCRIPT",
       "ENTER ALGORITHM",
       "ENTER LINUX",
       "ENTER PYTHON",
       "ENTER CAPSTONE",
       "ENTER BREAKOUT"
    ));

    //CONSTRUCTOR
    public Lobby(){
        super();
        setName(Name.LOBBY);
        setStaff(new Staff("Jeannette"));
    }

    //ACCESSOR METHODS
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getQuiz() {
        return null;
    }

    @Override
    public Map<String, String> getWildcard() {
        return null;
    }

    public List<String> getActions() {
        return actions;
    }

    @Override
    public void setActions(List<String> actions) {

    }

    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getName() +", "+
                getStaff()+"} ";
    }
}
