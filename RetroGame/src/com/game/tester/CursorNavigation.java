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
            System.out.println();
            printInPlace("somewhere");
            gotoxy(2,10);
        }

    }

    //print in place
    public static void printInPlace(String string){
        char escCode = 0x1B;
        int row = 25; int column = 100;
        System.out.print(String.format("%c[%d;%df"+string,escCode,row,column));
    }
    static void gotoxy(int line /* 1 based */,
                       int row  /* 1 based */) {
        System.out.print("\033[" + line + ";" + row + "H");
    }
}
