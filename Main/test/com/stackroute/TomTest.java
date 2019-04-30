package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomTest {
    Tom obj;

    @Before
    public void setUp() throws Exception {
        obj=new Tom();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void check()
    {
        String res=obj.checkEvenOdd();
        assertEquals("jerry", res);
    }

    @Test
    public void checkRange()
    {
        String res=obj.checkRange();
        assertEquals("True", res);
    }

    @Test
    public void checkNull()
    {
        boolean res=obj.checkNull();
        assertEquals(true, res);
    }
}