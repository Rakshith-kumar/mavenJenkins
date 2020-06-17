package com.rakshith.jenkins;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test 
    public void testName( )
    {
     org.junit.Assert.assertEquals("rakshith", App.returnName("rakshith"));
    }
     
    
}
