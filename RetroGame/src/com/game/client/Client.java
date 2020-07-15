package com.game.client;

import com.game.*;

public class Client {
    public static void main(String[] args) {

        Person instructor1=new Instructor("Jay");
        System.out.println(instructor1.toString());

        Person player1=new Player("KG");
        System.out.println(player1);

        Person tlgStaff1= new TlgStaff("Nancy");
        System.out.println(tlgStaff1);

        Person josh= new ClassMate("Josh");
        System.out.println(josh);

    }
}
