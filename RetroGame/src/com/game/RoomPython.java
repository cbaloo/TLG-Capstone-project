package com.game;

public class RoomPython extends Room {
    //CONSTRUCTOR
    public RoomPython(){
        super();
        setName(Name.PYTHON);
        setInstructor(new Instructor("Zach"));
    }


    @Override
    public String toString() {
        return "RoomPython{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
