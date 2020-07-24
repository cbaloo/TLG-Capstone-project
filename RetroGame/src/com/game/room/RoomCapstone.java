package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;

import java.util.*;

public class RoomCapstone extends Room {
    //INSTANCE VARIABLE
    private String message = "--------------------------------------------"+
            "\nWELCOME TO THE CAPSTONE CLASSROOM! YOU ARE ALMOST WORTHY!!";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));


    private Map<String, String> quiz = new HashMap<>() {
        {
            put("HOW MANY PRINCIPLES DOES AGILE HAVE?", "12");
            put("IN AGILE, THE HIGHEST PRIORITY IS TO SATISFY THE '--------'.", "CUSTOMER");
            put("A USER STORY IS A TOOL USED IN '-----' SOFTWARE DEVELOPMENT", "AGILE");
            put("WHEN USING AGILE, SPRINTS TYPICALLY LAST BETWEEN 1 AND 4 '-----'.", "WEEKS");
            put("WORKING SOFTWARE IS THE PRIMARY MEASURE OF '--------'?", "PROGRESS");
        }
    };
    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("RENNIE MAKES INFRASTRUCTURE AS SERVICE(IAAS) PIZZA EVERY SUNDAY? (TRUE/FALSE)", "FALSE");
            put("CLASSMATE WHO HAS THE MOST SCREENS", "BRUCE");

        }
    };
    private Map<String, String> iceBreaker = new HashMap<>() {
        {
            //put("IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?", "");
            //put("IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?","");
            //put("WHERE DID YOU GROW UP?","");
            //put("WHAT IS YOUR SSN????", "");
            //put("WHAT WAS YOUR FIRST CAR?", "");
            put("ARE YOU A MORNING PERSON?", "");
            //put("WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?", "");
            //put("WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?","");
        }
    };

    //CONSTRUCTOR
    public RoomCapstone() {
        super();
        setClassName(ClassName.CAPSTONE);
        setInstructor(new Instructor("RENNIE"));
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
        MessageArt.mapCapstone();
    }

    @Override
    public String toString() {
        return "RoomCapstone{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
