package com.game;

import com.game.person.Player;
import com.game.room.Room;
import com.game.room.RoomJava;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameHelperTest {
    @Test
    public void testUpdateScorePositive(){
        Player player=new Player("KG");
        GameHelper gameHelper= new GameHelper(new GameEngine());
        gameHelper.updateScore(player);
        assertEquals("1",player.getStatus().get("SCORE"));
        gameHelper.updateScore(player);
        assertEquals("2",player.getStatus().get("SCORE"));

    }

    @Test
    public void testUpdateScoreNegative(){
        Player player=new Player("KG");
        GameHelper gameHelper= new GameHelper(new GameEngine());
        gameHelper.updateScore(player);
        assertNotEquals("0",player.getStatus().get("SCORE"));
    }

    @Test
    public void testCheckEmptyActionPositive01(){
        Player player=new Player("KG");
        player.getStatus().put("SCORE","4");
        Room room= new RoomJava();
        room.getActions().clear();
        GameHelper gameHelper=new GameHelper(new GameEngine());
        gameHelper.checkEmptyAction(room,"ENTER JAVASCRIPT",player);
        assertEquals(room.getActions().get(0),"ENTER JAVASCRIPT");
    }

    @Test
    public void testCheckEmptyActionPositive02(){
        Player player=new Player("KG");
        player.getStatus().put("SCORE","2");
        Room room= new RoomJava();
        room.getActions().clear();
        GameHelper gameHelper=new GameHelper(new GameEngine());
        gameHelper.checkEmptyAction(room,"ENTER JAVASCRIPT",player);
        assertEquals(room.getActions().get(0),"ENTER BREAKOUT");
    }
}