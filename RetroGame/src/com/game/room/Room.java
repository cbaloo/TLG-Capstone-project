package com.game.room;

import com.game.person.Instructor;

import java.util.List;
import java.util.Map;

public abstract class Room {
    //INSTANCE VARIABLE
    private ClassName className;
    private Instructor instructor;

    //ABSTRACT METHODS
    public abstract String getMessage();

    public abstract Map<String, String> getQuiz();

    public abstract Map<String, String> getWildcard();

    public abstract Map<String, String> getIceBreaker();

    public abstract List<String> getActions();

    public abstract void setActions(List<String> actions);

    public abstract void printMap();

    //ACCESSOR METHODS
    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
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
                "name=" + getClassName() +
                ", instructor=" + getInstructor() +
                '}';
    }
}
