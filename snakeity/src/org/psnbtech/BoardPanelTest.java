package org.psnbtech;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.Point;
import java.awt.Graphics;

import static org.junit.Assert.*;

public class BoardPanelTest {
    private TileType[] tiles;
    private SnakeGame game;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void clearBoard() {

        BoardPanel bp = new BoardPanel(game);
        bp.clearBoard();
        assertArrayEquals(tiles, null);
    }


    @Test
    public void setTile() {
        BoardPanel bp = new BoardPanel(game);
        Point p1 = new Point(0,0);
        int ROW_COUNT=25;
        int COL_COUNT=25;
        int i=0;
        tiles = new TileType[ROW_COUNT * COL_COUNT];
        bp.setTile(p1,tiles[0]);
    }


    @Test
    public void testSetTile() {
        BoardPanel bp = new BoardPanel(game);
        int ROW_COUNT=25;
        int COL_COUNT=25;
        int i=0;
        tiles = new TileType[ROW_COUNT * COL_COUNT];
        bp.setTile(1,1,tiles[0]);
    }

    @Test
    public void getTile() {
        BoardPanel bp = new BoardPanel(game);
        bp.getTile(1,1);
    }


}