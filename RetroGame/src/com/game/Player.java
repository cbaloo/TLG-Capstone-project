package com.game;

public class Player extends Person {
    //INSTANCE VARIABLE
    private Title title;

    public Player(String name) {
        super(name);
        setTitle(Title.PLAYER);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + getName() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
