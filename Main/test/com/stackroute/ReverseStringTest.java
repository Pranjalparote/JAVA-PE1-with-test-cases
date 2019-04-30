package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

ReverseString revobj;
    ReverseString revobj2;


    @Before
    public void setUp() throws Exception {
        revobj=new ReverseString();
        revobj2=new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void revmethod()
    {
        //act
        String opstr=revobj.revmethod();
        //assert
        assertEquals("olleH",opstr);
    }

    @Test
    public void checkNull()
    {

        //act
        boolean b=revobj.checkNull();
        //assert
        assertEquals(false,b);
    }

   @Test
    public void checkisInteger()
    {
        //act
        boolean bint=revobj2.checkisInteger();
        //assert
        assertEquals(true,bint);
    }




}