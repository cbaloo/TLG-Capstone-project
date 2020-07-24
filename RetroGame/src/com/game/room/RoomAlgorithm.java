package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;

import java.util.*;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE ALGORITHMS CLASSROOM!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("A SET CAN HAVE DUPLICATES?(TRUE/FALSE)", "FALSE");
            put("LIST/ARRAY ARE ORDERED DATA STRUCTURE(TRUE/FALSE)","TRUE");
            put("STACK IS ALSO CALLED FIRST IN FIRST OUT(TRUE/FALSE)", "FALSE");
        }
    };
    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("TOM IS A MAN OF MAN OF MANY TALENTS? (TRUE/FALSE)", "TRUE");
            put("STEVE CAN DO NO WRONG?? (TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LOVES DOING LAUNDRY?", "HIRO");
        }
    };
    private Map<String, String> iceBreaker = new HashMap<>() {
        {
            //put("IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?", "");
            //put("IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?","");
            //put("WHERE DID YOU GROW UP?","");
            //put("WHAT IS YOUR SSN????", "");
            put("WHAT WAS YOUR FIRST CAR?", "");
            //put("ARE YOU A MORNING PERSON?", "");
            //put("WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?", "");
            //put("WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?","");
        }
    };

    //CONSTRUCTOR
    public RoomAlgorithm() {
        super();
        setClassName(ClassName.ALGORITHM);
        setInstructor(new Instructor("TOM"));
    }

    //ACCESSOR METHODS
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
        MessageArt.mapAlgo();
    }

    @Override
    public String toString() {
        return "RoomAlgorithm{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }

}
