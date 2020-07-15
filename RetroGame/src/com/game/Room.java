package com.game;

public class Room {
    //INSTANCE VARIABLE
    private Name name;
    private Instructor instructor;


    //NESTED STATIC CLASS
    public static enum Name{JAVA, JAVASCRIPT, ALGORITHM, LINUX, PYTHON, CAPSTONE, BREAKOUT}

    //CONSTRUCTORS

    //ACCESSOR METHODS
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        //TODO VALIDATION
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        //TODO VALIDATION
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
