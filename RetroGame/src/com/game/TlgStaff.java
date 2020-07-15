package com.game;

public class TlgStaff extends Person{
    //CONSTRUCTOR
    public TlgStaff(String name){
        super(name);
        setTitle(Title.TLGSTAFF);
    }


    @Override
    public String toString() {
        return "TlgStaff{" +
                "name=" + getName() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
