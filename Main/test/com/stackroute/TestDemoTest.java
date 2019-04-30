package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDemoTest {
TestDemo t1;
    @Before
    public void setUp() throws Exception {
        t1=new TestDemo();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void method1() {
        String str3=t1.Method1();
        assertEquals("SMALL",str3);

    }
}