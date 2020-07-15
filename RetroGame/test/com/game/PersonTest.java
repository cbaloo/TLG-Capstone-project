package com.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testConstructor(){
        Person p1= new Person("Kushal", Person.Title.PLAYER);
        assertEquals(p1.getName(),"Kushal");
        assertEquals(p1.getTitle(), Person.Title.PLAYER);
    }

}