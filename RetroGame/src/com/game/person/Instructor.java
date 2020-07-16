package com.game.person;

public class Instructor extends Person {
    //CONSTRUCTOR
    public Instructor(String name) {
        super(name);
        setTitle(Title.INSTRUCTOR);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name=" + getName() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
