package com.game.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {


    @Test
    public void playerConstructorPositive(){
        Player p1=new Player("GG");
        assertEquals(Person.Title.PLAYER,p1.getTitle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void playerConstructorNegative(){
        Player p1=new Player("");
    }
}