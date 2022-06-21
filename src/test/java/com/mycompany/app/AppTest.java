package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int output = App.Recursion(10);
		//return match
		if(55 == output){
		System.out.print(output + ": Pass");
			
        assertTrue( true );
        }
        else{
            assertTrue( false);
        }
    }
}
