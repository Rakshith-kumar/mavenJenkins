package com.rakshith.jenkins;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    
     
    public AppTest( String testName )
    {
     org.junit.Assert.assertEquals("rakshith", App.returnName("rakshith"));
    }
     
    
}
