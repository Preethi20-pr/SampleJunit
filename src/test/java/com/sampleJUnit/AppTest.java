package com.sampleJUnit;
 
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{
	// method to test case for addition
	
	@Test
	public void testadd() 
	  {
		App ap= new App() ;
			int exp=10;
			int res=ap.add(5, 5);
		    assertEquals(exp,res);
		
		}
	
	// method to test case for subtraction
	
	@Test
	public void testsub() 
	  {
		App ap= new App() ;
			int exp=0;
			int res=ap.sub(5, 5);
		    assertEquals(exp,res);
		
		}
	
	//method to test case for multiplication
	
	@Test
	public void testmul() 
	  {
		App ap= new App() ;
			int exp=25;
			int res=ap.mul(5, 5);
		    assertEquals(exp,res);
		
		}
	
	//method to test case for division
	
	@Test
	public void testdiv() 
	  {
		App ap= new App() ;
			int exp=1;
			int res=ap.div(5, 5);
		    assertEquals(exp,res);
		
		}
}



