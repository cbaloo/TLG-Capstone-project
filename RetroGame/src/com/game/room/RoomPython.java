package com.game.room;

import com.game.person.Instructor;

import java.util.HashMap;
import java.util.Map;

public class RoomPython extends Room {
    //INSTANCE VARIABLES
    private String roomMessage = "Welcome to the Python Classroom!";

    private Map<String,String> roomQuiz=new HashMap<>(){
        {
            put("a dictionary in Python contains a '---' value pair.", "key");
            put("API stands for Application Programming '---------'","interface");
            put("How do you comment out one single line of Python code","#");
            put("What is the correct file extension for Python files? '.pyt' or '.py'",".py");
            put("What method is used to return a string in upper case letters? upper() or uppercase()?","upper()");
            put("","");
            put("","");
        }
    };
    //CONSTRUCTOR
    public RoomPython(){
        super();
        setName(Name.PYTHON);
        setInstructor(new Instructor("Zach"));
    }

    //ACCESSOR METHOD
    public String getRoomMessage() {
        return roomMessage;
    }

    @Override
    public String toString() {
        return "RoomPython{" +
                "name=" + getName()+", "+
                getInstructor() + "\n" +
                getRoomMessage() + " } ";
    }
}
