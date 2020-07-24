package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;

import java.util.*;

public class RoomJS extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------"+
            "\nWELCOME TO JAVASCRIPT! ARE YOU CONFUSED YET??";
    private List<String> actions=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String,String> quiz =new HashMap<>(){
        {
            put("WHICH COMPANY DEVELOPED JAVASCRIPT, NETGEAR OR NETSCAPE?", "NETSCAPE");
            put("JAVASCRIPT CAN BE USED WITH CSS AND '----' TO CREATE INTERACTIVE WEB PAGES.", "HTML");
            put("JAVASCRIPT WAS FIRST KNOWN AS LIVESCRIPT OR ECMASCRIPT?", "LIVESCRIPT");
            put("IN JAVASCRIPT, SEMI-COLONS ARE REQUIRED (TRUE/FALSE)", "FALSE");
            put("JSON STANDS FOR JAVASCRIPT OBJECT '--------'", "NOTATION");

        }
    };

    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("HOW MANY INSTRUCTORS DID WE HAVE FOR OUR JAVASCRIPT COURSE?(1/2)", "2");
            put("CLASSMATE WHO RELOCATES TO DIFFERENT ROOMS/AREA OF HIS/HER HOME FOR CLASS?", "DAEUN");
        }
    };

    private Map<String, String> iceBreaker = new HashMap<>() {
        {
            //put("IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?", "");
            put("IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?", "");
            //put("WHERE DID YOU GROW UP?","");
            //put("WHAT IS YOUR SSN????", "");
            //put("WHAT WAS YOUR FIRST CAR?", "");
            //put("ARE YOU A MORNING PERSON?", "");
            //put("WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?", "");
            //put("WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?","");
        }
    };

    //CONSTRUCTOR
    public RoomJS() {
        super();
        setClassName(ClassName.JAVASCRIPT);
        setInstructor(new Instructor("NELLY"));
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
        MessageArt.mapJS();
    }

    @Override
    public String toString() {
        return "RoomJavaScript{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
