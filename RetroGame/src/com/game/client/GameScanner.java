package com.game.client;

import com.game.tester.GameEngineScanner;


import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class GameScanner {
    public static void main(String[] args) throws IOException {

        Scanner scanner=null;
        if(args.length>0){
            String file = args[0];
            Path path= FileSystems.getDefault().getPath(file);
            scanner=new Scanner(path);
        }
        else {
            scanner = new Scanner(System.in);
        }

        GameEngineScanner gameEngineScanner = new GameEngineScanner();
        gameEngineScanner.start(scanner);

    }
}
