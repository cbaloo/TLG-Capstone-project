package com.game.room;

import com.game.person.Instructor;
import com.game.person.Staff;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Room {
    //INSTANCE VARIABLE
    private Staff staff;
    private Name name;
    private Instructor instructor;
    private Map<String, Boolean> roomChecks = new HashMap<>(){
        {
            put(Name.JAVASCRIPT.value(),false);
            put(Name.PYTHON.value(),false);
            put(Name.LINUX.value(),false);
            put(Name.ALGORITHM.value(),false);
            put(Name.CAPSTONE.value(),false);
            put(Name.LOBBY.value(),false);
            put(Name.BREAKOUT.value(),false);
        }
    };


    //NESTED STATIC CLASS
    public static enum Name{
        JAVA("Java"),
        JAVASCRIPT("JavaScript"),
        ALGORITHM("Algorithm"),
        LINUX("Linux"),
        PYTHON("Python"),
        CAPSTONE("Capstone"),
        BREAKOUT("Breakout"),
        LOBBY("Lobby");

        private String value;
        Name(String value){
            this.value=value;
        }
        public String value(){return value;}
    }

    //ABSTRACT METHOD
    public abstract String getMessage();
    public abstract Map<String, String> getQuiz();
    public abstract Map<String, String> getWildcard();
    public abstract List<String> getActions();

    //ACCESSOR METHODS
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Map<String, Boolean> getRoomChecks() {
        return roomChecks;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name=" + getName() +
                ", instructor=" + getInstructor() +
                '}';
    }
}
