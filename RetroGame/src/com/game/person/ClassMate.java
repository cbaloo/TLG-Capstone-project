package com.game.person;

import com.game.person.Person;

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
