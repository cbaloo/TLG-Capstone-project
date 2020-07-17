package com.game.room;

import com.game.person.Instructor;

import java.util.List;
import java.util.Map;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String message = "Welcome to the Algorithms Classroom!";

    //CONSTRUCTOR
    public RoomAlgorithm(){
        super();
        setName(Name.ALGORITHM);
        setInstructor(new Instructor("Tom"));
    }

    //ACCESSOR METHODS
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Map<String, String> getQuiz() {
        return null;
    }

    @Override
    public Map<String, String> getWildcard() {
        return null;
    }

    @Override
    public List<String> getActions() {
        return null;
    }

    @Override
    public String toString() {
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getMessage() + " } ";
    }

}
