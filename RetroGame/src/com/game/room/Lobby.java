package com.game.room;

import com.game.person.Instructor;

import java.util.*;

public class Lobby extends Room {
    //INSTANT VARIABLE
    private String message="--------------------------------------------"+
            "\nJEANNETTE WELCOMES YOU AND LET YOU KNOW THAT THE FIRST CALSS YOU WILL ATTEND IS JAVA";
    //action options in this particular room
    private List<String> actions=new ArrayList(Arrays.asList(
       "ENTER JAVA",
       "ENTER JAVASCRIPT",
       "ENTER ALGORITHM",
       "ENTER LINUX",
       "ENTER PYTHON",
       "ENTER CAPSTONE"
    ));
    private Map<String,String> quiz =new HashMap<>(){
        {
            put("HOW MANY AMAZON LEADERSHIP PRINCIPLES ARE THERE?","14");
            put("HOW MANY MONTHS IS YOUR TLG LEARNING JOURNEY?", "4");
        }
    };

    private Map<String, String> wildCardQuiz = new HashMap<>() {
        {
            put("WHO 'INSTRUCTS' THE  INSTRUCTORS ON ADOBE CONNECT?", "JEANNETTE");
        }
    };

    private Map<String, String> iceBreaker = new HashMap<>() {
        {
            //put("IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?", "");
            //put("IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?","");
            //put("WHERE DID YOU GROW UP?","");
            //put("WHAT IS YOUR SSN????", "");
            //put("WHAT WAS YOUR FIRST CAR?", "");
            //put("ARE YOU A MORNING PERSON?", "");
            put("WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?", "");
            //put("WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?","");
        }
    };

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

    }

    @Override
    public String toString() {
        return "Lobby{" +
                "name=" + getClassName() +", "+
                getInstructor()+"} ";
    }
}
