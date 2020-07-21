package com.game.room;

import com.game.person.Instructor;

import java.util.List;
import java.util.Map;

public abstract class Room {
    //INSTANCE VARIABLE
    private Name name;
    private Instructor instructor;


    //NESTED STATIC CLASS
    public static enum Name {
        JAVA("JAVA"),
        JAVASCRIPT("JAVASCRIPT"),
        ALGORITHM("ALGORITHM"),
        LINUX("LINUX"),
        PYTHON("PYTHON"),
        CAPSTONE("CAPSTONE"),
        BREAKOUT("BREAKOUT"),
        LOBBY("LOBBY");

        private String value;

        Name(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    //ABSTRACT METHODS
    public abstract String getMessage();

    public abstract Map<String, String> getQuiz();

    public abstract Map<String, String> getWildcard();

    public abstract List<String> getActions();

    public abstract void setActions(List<String> actions);

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
