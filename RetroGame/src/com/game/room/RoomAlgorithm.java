package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.Map;

public class RoomAlgorithm extends Room {
    //INSTANCE VARIABLE
    private String roomMessage = "Welcome to the Algorithms Classroom!";

    private Map<String, String> roomQuiz = new HashMap<>() {
        {
            put("", "");
            put("", "");
            put("", "");
        }
    };

    //CONSTRUCTOR
    public RoomAlgorithm() {
        super();
        setName(Name.ALGORITHM);
        setInstructor(new Instructor("Tom"));
    }

    //ACCESSOR METHODS
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomAlgorithm{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }

}
