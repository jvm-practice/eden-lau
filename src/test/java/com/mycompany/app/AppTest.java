package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testAdd() {
        JunitDemo jd = new JunitDemo();
        int res = jd.add(2, 4);
        assertEquals(6, res);
        assertNotEquals(8, res);
    }
}
