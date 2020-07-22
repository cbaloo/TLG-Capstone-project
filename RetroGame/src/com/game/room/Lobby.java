package com.game.room;

import com.game.person.Instructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private String message="--------------------------------------------"+
            "\nYOU ARE IN THE LOBBY AND SEE MANY CLASSROOMS.\n"+"JEANNETTE WELCOMES YOU AND LET YOU KNOW THAT THE FIRST CALSS YOU WILL ATTEND IS JAVA";
    //action options in this particular room
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
        setClassName(ClassName.LOBBY);
        setInstructor(new Instructor("JEANNETTE"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    //LOBBY DOES NOT HAVE QUIZ FOR NOW
    @Override
    public Map<String, String> getQuiz() {
        return null;
    }
    //LOBBY DOES NOT HAVE WILDCARD QUIZ FOR NOW
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

    }

    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getClassName() +", "+
                getInstructor()+"} ";
    }
}
