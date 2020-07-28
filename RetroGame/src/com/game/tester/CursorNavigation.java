package com.game.tester;

import java.io.Console;

public class CursorNavigation {

    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.print("NO CONSOLE AVAILABLE");
            return;
        }
        while (true){
            console.readLine("Question: ");
//            System.out.println();
//            printInPlace("somewhere");

            char escCode = 0x1B;
            int x=6;
            System.out.println(String.format("%c[%d"+"n",escCode,x));
            System.out.println(escCode+"[6n");
            System.out.println("*********");
        }

    }

    //print in place
    public static void printInPlace(String string){
        char escCode = 0x1B;
        int row = 25; int column = 100;
        System.out.println(String.format("%c[%d;%df"+string,escCode,row,column));
    }

}
