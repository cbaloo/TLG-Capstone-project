package com.game;

public class Person {
    //INSTANCE VARIABLE
    private String name;
    private Title title;



    //CONSTRUCTORS
    public Person(String name, Title title) {
        this.name = name;
        this.title = title;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(){};

    //STATIC NESTED CLASSES
    public static enum Title{INSTRUCTOR, CLASSMATE, TLGSTAFF, PLAYER}


    //ACCESSOR METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //TODO VALIDATION
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
                "name='" + name + '\'' +
                ", title=" + title +
                '}';
    }
}
