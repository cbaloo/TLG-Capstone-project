package com.game;

import com.game.room.Lobby;
import com.game.room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameEngineTest {
    private GameHelper gameHelper;

    @Before
    public void setUp() throws Exception {
        GameEngine gameEngine = new GameEngine();
        gameHelper=new GameHelper(gameEngine);
    }

    @Test
    public void lobbyAction() {
    }
}