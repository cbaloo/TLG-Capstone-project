package com.game;

public class RoomJS extends Room {
    //CONSTRUCTOR
    public RoomJS(){
        super();
        setName(Name.JAVASCRIPT);
        setInstructor(new Instructor("Nelly"));
    }


    @Override
    public String toString() {
        return "RoomJavaScript{" +
                "name=" + getName()+", "+
                getInstructor() +
                '}';
    }
}
