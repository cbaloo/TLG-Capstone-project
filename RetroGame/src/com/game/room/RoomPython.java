package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;

import java.util.*;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------" +
            "\nWELCOME TO THE PYTHON CLASSROOM!";
    private List<String> actions = new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("WHITE SPACES ARE THE LEAST OF OUR WORRIES WHILE CODING IN PYTHON? (TRUE/FALSE)", "FALSE");
            put("LIST IS A PREDEFINED DATA TYPE IN PYTHON? (TRUE/FALSE)", "TRUE");
            put("TUPLE IS MUTABLE? (TRUE/FALSE)", "FALSE");
        }
    };
    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("WE WERE IS SOME KIND OF GANG WHILE WE WERE GOING THROUGH THE PYTHON COURSE?(TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LIVES CLOSEST TO MOUNT RAINIER", "BRAD");
        }
    };
    private Map<String, String> iceBreaker = new HashMap<>() {
        {
            //put("IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?", "");
            //put("IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?","");
            //put("WHERE DID YOU GROW UP?","");
            put("WHAT IS YOUR SSN?!?!?!", "");
            //put("WHAT WAS YOUR FIRST CAR?", "");
            //put("ARE YOU A MORNING PERSON?", "");
            //put("WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?", "");
            //put("WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?","");
        }
    };

    //CONSTRUCTOR
    public RoomPython() {
        super();
        setClassName(ClassName.PYTHON);
        setInstructor(new Instructor("ZACH"));
    }

    //ACCESSOR METHOD
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getQuiz() {
        return quiz;
    }

    @Override
    public Map<String, String> getWildcard() {
        return wildCardQuiz;
    }

    @Override
    public Map<String, String> getIceBreaker() {
        return iceBreaker;
    }

    @Override
    public List<String> getActions() {
        return actions;
    }

    @Override
    public void setActions(List<String> actions) {
        this.actions = actions;
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
