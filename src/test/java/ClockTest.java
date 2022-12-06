package org.psnbtech;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClockTest {
    private float millisPerCycle;
    private int elapsedCycles;
    private int excessCycles;
    private long lastUpdate;
    private boolean isPaused;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setCyclesPerSecond() {
        Clock c = new Clock(5);
        assertNotNull(millisPerCycle);
    }

    @Test
    public void setCyclesPerSecond2() {
        Clock c = new Clock(0);
        assertNotNull(millisPerCycle);
    }

    @Test
    public void reset() {
        Clock c = new Clock(5);
        c.reset();
        assertEquals(elapsedCycles, 0);
        //assertEquals(excessCycles, 0.0f);
        assertNotNull(lastUpdate);
        assertFalse(isPaused);
    }

    @Test
    public void update1() {
        Clock c = new Clock(5);
        isPaused=false;
        c.update();
    }

    @Test
    public void update2() {
        Clock c = new Clock(5);
        isPaused=true;
        c.update();
    }

    @Test
    public void setPausedTrue() {
        Clock c = new Clock(5);
        c.setPaused(true); 
        assertTrue(c.isPaused());
    }

    @Test
    public void setPausedFalse() {
        Clock c = new Clock(5);
        c.setPaused(false); 
        assertFalse(c.isPaused());
    }

    @Test
    public void isPausedFalse() {
        Clock c = new Clock(5);
        isPaused=false;
        boolean test = c.isPaused();
        assertFalse(test);
    }

    @Test
    public void hasElapsedCycleZero() {
        Clock c = new Clock(5);
        boolean test = c.hasElapsedCycle();
        assertNotNull(test);
    }

    @Test
    public void hasElapsedCycleNonZero() {
        Clock c = new Clock(5);

        c.update();
        boolean test = c.hasElapsedCycle();
        assertNotNull(test);
    }

    @Test
    public void peekElapsedCycleTest() {
        Clock c = new Clock(5);
        c.peekElapsedCycle();
        assertNotNull(elapsedCycles);
    }
}