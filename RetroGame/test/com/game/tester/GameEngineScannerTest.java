package com.game.tester;

import com.game.tester.GameEngineScanner;
import org.junit.Test;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class GameEngineScannerTest {

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

        String  file = "C:\\StudentWork\\Capstone01\\RetroGame\\src\\com\\game\\mock01.txt";
        Path path= FileSystems.getDefault().getPath(file);
        System.out.println();
        System.out.println(path);
        scanner= new Scanner(path);
        GameEngineScanner gameEngineScanner=new GameEngineScanner();
        gameEngineScanner.start(scanner);

    }
}