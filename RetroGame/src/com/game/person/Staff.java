package com.game.person;

public class Staff extends Person {
    //CONSTRUCTOR
    public Staff(String name) {
        super(name);
        setTitle(Title.STAFF);
    }


    @Override
    public String toString() {
        return "TlgStaff{" +
                "name=" + getName() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
