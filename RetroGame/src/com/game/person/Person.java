package com.game.person;

public class Person {
    //INSTANCE VARIABLE
    private String name;
    private Title title;


    //CONSTRUCTORS
    public Person(String name, Title title) {
        setName(name);
        setTitle(title);
    }
    public Person(String name) {
        setName(name);
    }
    public Person(){};

    //ACCESSOR METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if(name.isEmpty()){
            throw new IllegalArgumentException("ENTER VALID NAME!");
        }
        this.name = name;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", title=" + getTitle() +
                '}';
    }
}
