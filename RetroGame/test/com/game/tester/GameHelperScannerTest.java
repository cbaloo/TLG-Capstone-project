package com.game.tester;

import com.game.person.Player;
import com.game.room.Lobby;
import com.game.room.Room;
import com.game.tester.GameEngineScanner;
import com.game.tester.GameHelperScanner;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class GameHelperScannerTest {
    private Scanner scanner;


    @Test
    public void lobbyActionPositive() throws IOException {
        String  file = "C:\\StudentWork\\Capstone01\\RetroGame\\src\\com\\game\\mock02.txt";
        Path path= FileSystems.getDefault().getPath(file);
        scanner= new Scanner(path);
        GameEngineScanner gameEngineScanner=new GameEngineScanner();
        GameHelperScanner gameHelperScanner= new GameHelperScanner(gameEngineScanner);
        Room lobby=new Lobby();
        Player player= new Player("KG");

    }

    @Test
    public void classActions() {
    }
}