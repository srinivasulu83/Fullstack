package com.nt.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
@SuppressWarnings("unused")
public class AppTest 
{  
    @Test
    public void testSumWithPositives()
    {
        int value1=10;
        int value=20;
        int expected=30;
        App app=new App();
        int actual=app.sum(value1,value);
        assertEquals(expected,actual);
    }

@Test
public void testSumWithNegtives() {
     int value1=20;
     int value=20;
     int expected=30;
     App app=new App();
     int actual=app.sum(value1,value);
     assertEquals(expected,actual);
}
}