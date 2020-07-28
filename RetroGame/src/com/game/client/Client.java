package com.game.client;

import com.game.person.Instructor;
import com.game.person.Person;
import com.game.person.Player;
import com.game.room.*;

import java.util.Scanner;


public class Client {
    public static void main(String[] args) {

        Person instructor1 = new Instructor("JAY");
        System.out.println(instructor1.toString());

        Player player1 = new Player("KG");
        System.out.println(player1);

        Room java = new RoomJava();
        System.out.println(java);

        Room javascript = new RoomJS();
        System.out.println(javascript);

        Room algorithm = new RoomAlgorithm();
        System.out.println(algorithm);

        Room python = new RoomPython();
        System.out.println(python);

        Room linux = new RoomLinux();
        System.out.println(linux);

        Room capstone = new RoomCapstone();
        System.out.println(capstone);

        Room lobby = new Lobby();
        System.out.println(lobby);

        char escCode = 0x1B;
        int row = 20; int column = 20;
        System.out.print(String.format("%c[%d;%df",escCode,row,column));

        System.out.println("#########");
        /*Syntax for Users Input to Name, Gender, Age, Religion ...*/
        Scanner input = new Scanner(System.in);

        System.out.print((char)27+ "[40m"); // Change Background into BLACK...
        System.out.print((char)27+ "[1m");   // Change Text Attribute into BRIGHT...
        System.out.print((char)27+ "[32m"); // Change Text into GREEN...
        System.out.print((char)27+ "[2J");    // CLEAR the SCREEN...

      /* Informations or Questions to be Ask to the Users...
      1.) PERSONAL INFORMATION */
        System.out.println("*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                        PERSONAL INFORMATION                         <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Name               : ");
        System.out.print("\n Course             : ");
        System.out.print("\n Age                : ");
        System.out.print("\n Religion           : ");
        // 2.) FAMILY BACKGROUND
        System.out.println("\n*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                          FAMILY BACKGROUND                          <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Mothers Name       : ");
        System.out.print("\n Fathers Name       : ");
        System.out.print("\n Mothers Occupation : ");
        System.out.print("\n Fathers Occupation : ");
        // 3.) EDUCATIONAL BCKGROUND
        System.out.println("\n*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                       EDUCATIONAL BACKGROUND                        <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Elementary         : ");
        System.out.print("\n Address            : ");
        System.out.print("\n High School        : ");
        System.out.print("\n Address            : ");
        System.out.print("\n College            : ");
        System.out.print("\n Address            : ");
        // 4.) CONTACT DETAILS
        System.out.println("\n*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                           CONTACT DETAILS                           <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Residential Address: ");
        System.out.print("\n E-mail Address     : ");
        System.out.print("\n Mobile Number      : ");
        System.out.println("\n*******************************************************************************");

        System.out.print((char)27+ "[37m");     // Set Text Color into WHITE...
        // Ask input from the User for the Following:
        System.out.print((char)27+ "[4;23f");     // a.) Name - Nme
        String Nme = input.nextLine();
        System.out.print((char)27+ "[5;23f");     // b.) Course - Crse
        String Crse = input.nextLine();
        System.out.print((char)27+ "[6;23f");     // c.) Age - Ag
        double Ag = input.nextDouble();
        input.nextLine();
        System.out.print((char)27+ "[7;23f");    // d.) Religion - Rlgn
        String Rlgn = input.nextLine();
        System.out.print((char)27+ "[11;23f");   // e.) Mothers Name - MN
        String MN = input.nextLine();
        System.out.print((char)27+ "[12;23f");   // f.) Fathers Name - FN
        String FN = input.nextLine();
        System.out.print((char)27+ "[13;23f");   // g.) Mothers Occupation - MO
        String MO = input.nextLine();
        System.out.print((char)27+ "[14;23f");   // h.) Fathers Occupation - FO
        String FO = input.nextLine();
        System.out.print((char)27+ "[18;23f");   // i.) Elementary - E
        String E = input.nextLine();
        System.out.print((char)27+ "[19;23f");    // j.) Address - Add
        String Add = input.nextLine();
        System.out.print((char)27+ "[20;23f");   // k.) High School - HS
        String HS = input.nextLine();
        System.out.print((char)27+ "[21;23f");   // l.) Address - Add1
        String Add1 = input.nextLine();
        System.out.print((char)27+ "[22;23f");   // m.) College - C
        String C = input.nextLine();
        System.out.print((char)27+ "[23;23f");   // n.) Address - Add2
        String Add2 = input.nextLine();
        System.out.print((char)27+ "[27;23f");   // o.) Residential Address - RA
        String RA = input.nextLine();
        System.out.print((char)27+ "[28;23f");   // p.) E-mail Address - EA
        String EA = input.nextLine();
        System.out.print((char)27+ "[29;23f");   // q.) Mobile Number - MNum
        long MNum = input.nextLong();
        input.nextLine();

        // Display The OverAll OUTPUT of the DATA Inputted...
        System.out.print((char)27+ "[33;5f");
        System.out.println("Press ENTER To Display the OUTPUT!");
        System.out.print((char)27+ "[33;40f");
        String Continue = input.nextLine();
        System.out.print((char)27+ "[40m");   // Change Background into BLACK...
        System.out.print((char)27+ "[1m");     // Change Text Attribute into BRIGHT...
        System.out.print((char)27+ "[32m");   // Change Text into GREEN...
        System.out.print((char)27+ "[2J");      // CLEAR the SCREEN...

        System.out.println("*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                        PERSONAL INFORMATION                         <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Name               : ");
        System.out.print("\n Course             : ");
        System.out.print("\n Age                : ");
        System.out.print("\n Religion           : ");
        // 2.) FAMILY BACKGROUND
        System.out.println("\n*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                          FAMILY BACKGROUND                          <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Mothers Name       : ");
        System.out.print("\n Fathers Name       : ");
        System.out.print("\n Mothers Occupation : ");
        System.out.print("\n Fathers Occupation : ");
        // 3.) EDUCATIONAL BCKGROUND
        System.out.println("\n*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                       EDUCATIONAL BACKGROUND                        <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Elementary         : ");
        System.out.print("\n Address            : ");
        System.out.print("\n High School        : ");
        System.out.print("\n Address            : ");
        System.out.print("\n College            : ");
        System.out.print("\n Address            : ");
        // 4.) CONTACT DETAILS
        System.out.println("\n*******************************************************************************");
        System.out.println((char)27+ "[31m" + "*+++>                           CONTACT DETAILS                           <+++*");
        System.out.println((char)27+ "[32m" + "*******************************************************************************");
        System.out.print(" Residential Address: ");
        System.out.print("\n E-mail Address     : ");
        System.out.print("\n Mobile Number      : ");
        // Assign the Location of every OUTPUT...
        System.out.print((char)27+ "[37m");
        System.out.print((char)27+ "[4;23f");
        System.out.print(Nme);
        System.out.print((char)27+ "[5;23f");
        System.out.print(Crse);
        System.out.print((char)27+ "[6;23f");
        System.out.print(Ag);
        System.out.print((char)27+ "[7;23f");
        System.out.print(Rlgn);
        System.out.print((char)27+ "[11;23f");
        System.out.print(MN);
        System.out.print((char)27+ "[12;23f");
        System.out.print(FN);
        System.out.print((char)27+ "[13;23f");
        System.out.print(MO);
        System.out.print((char)27+ "[14;23f");
        System.out.print(FO);
        System.out.print((char)27+ "[18;23f");
        System.out.print(E);
        System.out.print((char)27+ "[19;23f");
        System.out.print(Add);
        System.out.print((char)27+ "[20;23f");
        System.out.print(HS);
        System.out.print((char)27+ "[21;23f");
        System.out.print(Add1);
        System.out.print((char)27+ "[22;23f");
        System.out.print(C);
        System.out.print((char)27+ "[23;23f");
        System.out.print(Add2);
        System.out.print((char)27+ "[27;23f");
        System.out.print(RA);
        System.out.print((char)27+ "[28;23f");
        System.out.print(EA);
        System.out.print((char)27+ "[29;23f");
        System.out.print("+63" + MNum);
        System.out.println((char)27+ "[32m");
        System.out.println("*******************************************************************************\n\n\n");
    }
}
