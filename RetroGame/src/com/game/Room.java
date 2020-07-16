package com.game;

import java.util.HashMap;
import java.util.Map;

public class Room {
    //INSTANCE VARIABLE
    private Name name;
    private Instructor instructor;
    public Map<Name, Boolean> action= new HashMap<>(){
        {
            put(Name.JAVASCRIPT,false);
            put(Name.PYTHON,false);
            put(Name.LINUX,false);
            put(Name.ALGORITHM,false);
            put(Name.CAPSTONE,false);
            put(Name.LOBBY,true);
            put(Name.BREAKOUT,false);
        }
    };


    //NESTED STATIC CLASS
    public static enum Name{JAVA, JAVASCRIPT, ALGORITHM, LINUX, PYTHON, CAPSTONE, BREAKOUT,LOBBY}

    //CONSTRUCTORS

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


    @Override
    public String toString() {
        return "Room{" +
                "name=" + getName() +
                ", instructor=" + getInstructor() +
                '}';
    }
}
