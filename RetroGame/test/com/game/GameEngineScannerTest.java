package com.game;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.*;

public class GameEngineScannerTest {
    @Test
    public void testStartPositive(){
        String currentDirectory = System.getProperty("user.dir");
        currentDirectory = currentDirectory + "\\src\\com\\game\\";
        System.out.println(currentDirectory);
        Scanner sc = setUpScanner(currentDirectory,"test.txt");
        System.out.println(sc.next());
    }

    private Scanner setUpScanner(String fileDirectory, String filename) {
        Scanner sc = null;
        try{
            sc = new Scanner(new File(fileDirectory + filename));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sc;
    }

}