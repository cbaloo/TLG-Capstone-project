package com.game.room;

import com.game.MessageArt;
import com.game.person.Instructor;

import java.util.*;

public class RoomLinux extends Room {
    //INSTANCE VARIABLES
    private String message = "--------------------------------------------" +
            "\nWELCOME TO THE LINUX CLASSROOM!";
    private List<String> actions = new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"
    ));

    private Map<String, String> quiz = new HashMap<>() {
        {
            put("WHAT US THE LINUX COMMAND TO CHANGE THE DIRECTORIES?", "CD");
            put("WHAT US THE LINUX COMMAND TO LIST THE CONTENTS OF A DIRECTORY?", "LS");
            put("WHAT US THE LINUX COMMAND TO MAKE A DIRECTORY?", "MKDIR");

        }
    };

    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("WAS PHOTOGRAPHY ONE OF JOHN'S OTHER PASSION?(TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LOVES GARDENING AND HAS RECENTLY GOTTEN INTO BIRD WATCHING?", "MICHAEL");
        }
    };

    private Map<String, String> iceBreaker = new HashMap<>() {
        {
            //put("IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?", "");
            //put("IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?","");
            put("WHERE DID YOU GROW UP?", "");
            //put("WHAT IS YOUR SSN????", "");
            //put("WHAT WAS YOUR FIRST CAR?", "");
            //put("ARE YOU A MORNING PERSON?", "");
            //put("WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?", "");
            //put("WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?","");
        }
    };


    //CONSTRUCTOR
    public RoomLinux() {
        super();
        setClassName(ClassName.LINUX);
        setInstructor(new Instructor("JOHN"));
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
        MessageArt.mapLinux();
    }

    @Override
    public String toString() {
        return "RoomLinux{" +
                "name=" + getClassName() + ", " +
                getInstructor() + "\n" +
                getMessage() + " } ";
    }
}
