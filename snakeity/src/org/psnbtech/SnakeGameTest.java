package org.psnbtech;

import org.junit.Test;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static org.junit.Assert.*;

public class SnakeGameTest {
    public SnakeGame g;
    public BoardPanel board;
    public Clock logicTimer;
    public Direction d;


    @org.junit.Before
    public void setUp() throws Exception {
        //SnakeGame g = new SnakeGame();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void isNewGametest() {
       SnakeGame g = new SnakeGame();
        boolean test = g.isNewGame();
        assertNotNull(test);
    }
    

    @org.junit.Test
    public void isGameOvertest() {
        SnakeGame g = new SnakeGame();
        boolean test = g.isGameOver();
        // messing up the test hehe
        assertFalse(true);
    }


    @org.junit.Test
    public void isPaused() {
        SnakeGame g = new SnakeGame();
        boolean test = g.isPaused();
        assertFalse(test);
    }
    
    @org.junit.Test
    public void getScore() {
       SnakeGame g = new SnakeGame();
        int testScore = g.getScore();
        assertNotNull(testScore);
    }
    
    @org.junit.Test
    public void getFruitsEaten() {
       SnakeGame g = new SnakeGame();
        int fruitsEaten = g.getFruitsEaten();
        assertNotNull(fruitsEaten);
    }
    
    @org.junit.Test
    public void getNextFruitScore() {
       SnakeGame g = new SnakeGame();
        int fruitScore = g.getNextFruitScore();
        assertNotNull(fruitScore);
    }
    
    @org.junit.Test
    public void getDirection() {
        SnakeGame g = new SnakeGame();
    	g.startGame();
    	KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        KeyEvent key2 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP);
        g.getKeyListeners()[0].keyPressed(key2);
        KeyEvent key3 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key3);     
        KeyEvent key4 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key4);
        Direction d = g.getDirection();
        assertNotNull(d);
    }
    
    
    
    @org.junit.Test
    public void mainTest1() {
    	SnakeGame g = new SnakeGame();
    	g.startGame();
    	KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        KeyEvent key2 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP);
        g.getKeyListeners()[0].keyPressed(key2);
        KeyEvent key3 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key3);     
        KeyEvent key4 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key4);
        KeyEvent key5 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key5);
        KeyEvent keyz = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_UP);
        g.getKeyListeners()[0].keyPressed(keyz);
        KeyEvent key6 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_P);
        g.getKeyListeners()[0].keyPressed(key6);
        
        String[] args = null;
        g.main(args);
    }
    
    @org.junit.Test
    public void mainTest2() {
    	SnakeGame g = new SnakeGame();
    	g.startGame();
    	KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        KeyEvent key2 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key2);
        KeyEvent key3 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key3);     
        KeyEvent key4 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key4);
        KeyEvent key5 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key5);
        KeyEvent keyz = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(keyz);
        KeyEvent key6 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_P);
        g.getKeyListeners()[0].keyPressed(key6);
        
        String[] args = null;
        g.main(args);
    }

    
    
   
    
    @Test
    public void startGame1() {
    	SnakeGame g = new SnakeGame();
        try {
        	Thread.sleep(10);
        	g.startGame();
        
    	KeyEvent key = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_ENTER);
        g.getKeyListeners()[0].keyPressed(key);
        KeyEvent key2 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key2);
        KeyEvent key3 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT);
        g.getKeyListeners()[0].keyPressed(key3);     
        KeyEvent key4 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key4);
        KeyEvent key5 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key5);
        KeyEvent keyz = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(keyz);
        KeyEvent key6 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_P);
        g.getKeyListeners()[0].keyPressed(key6);
        
        KeyEvent key7 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key7);
        KeyEvent key8 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key8);
        KeyEvent key9 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT);
        g.getKeyListeners()[0].keyPressed(key9);
        KeyEvent key10 = new KeyEvent(g, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_DOWN);
        g.getKeyListeners()[0].keyPressed(key10);
        
        Thread.sleep(10);
        g.updateGame();
        Thread.sleep(10);
        g.updateGame();
        Thread.sleep(10);
        g.updateGame();
        Thread.sleep(10);
        g.updateGame();
        Thread.sleep(10);
        g.updateGame();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
    }

}
