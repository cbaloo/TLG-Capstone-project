package com.game;

public class ClassMate extends Person {
    //CONSTRUCTOR
    public ClassMate(String name) {
        super(name);
        setTitle(Title.CLASSMATE);
    }

    @Override
    public String toString() {
        return "ClassMate{" +
                "name=" + getName() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
