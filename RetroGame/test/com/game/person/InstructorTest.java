package com.game.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void instructorConstructorPositive(){
        Instructor teach=new Instructor("Tom");
        System.out.println(teach);
        assertEquals(Person.Title.INSTRUCTOR,teach.getTitle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void instructorConstructorNegative(){
        Instructor teach=new Instructor("");
    }

}