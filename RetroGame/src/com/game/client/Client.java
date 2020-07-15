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

        Room room=new Room();
        System.out.println(room);

        Room java=new RoomJava();
        System.out.println(java);

        Room javascript=new RoomJS();
        System.out.println(javascript);

        Room algorithm= new RoomAlgorithm();
        System.out.println(algorithm);

        Room python= new RoomPython();
        System.out.println(python);

        Room linux= new RoomLinux();
        System.out.println(linux);

        Room capstone= new RoomCapstone();
        System.out.println(capstone);

        Room breakout=new RoomBreakout();
        System.out.println(breakout);

    }
}
