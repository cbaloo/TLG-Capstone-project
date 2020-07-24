package com.game;

import com.sun.security.jgss.GSSUtil;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

import static org.junit.Assert.*;

public class GameEngineScannerTest {
//    @Test
//    public void testScannerStartPositive(){
//        String currentDirectory = System.getProperty("user.dir");
//        currentDirectory = currentDirectory + "\\src\\com\\game\\";
//        System.out.println(currentDirectory);
//        Scanner scanner = setUpScanner(currentDirectory,"mock.txt");
//        System.out.println(scanner);
//    }
//
//    private Scanner setUpScanner(String fileDirectory, String filename) {
//        Scanner sc = null;
//        try{
//            sc = new Scanner(new File(fileDirectory + filename));
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return sc;
//    }


    @Test
    public void experiment(){
        String data = "Hello, World!\r\n";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner.next());
        } finally {
            System.setIn(stdin);
        }
    }
    private Scanner scanner;

    @Test
    public void testStartPositive() throws IOException {

        String  file = "C:\\StudentWork\\Capstone01\\RetroGame\\src\\com\\game\\mock.txt";
        Path path= FileSystems.getDefault().getPath(file);
        System.out.println();
        System.out.println(path);
        scanner= new Scanner(path);
        GameEngineScanner gameEngineScanner=new GameEngineScanner();
        gameEngineScanner.start(scanner);

    }
}