package com.game.client;

import com.game.GameEngine;
import com.game.GameEngineScanner;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GameScanner {
    public static void main(String[] args) throws IOException {

        GameEngineScanner gameEngineScanner = new GameEngineScanner();
        gameEngineScanner.start();

//        Scanner sc= new Scanner(System.in);
//        String name=sc.next();
//        System.out.println(name);
    }
}
