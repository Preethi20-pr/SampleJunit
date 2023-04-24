package com.sampleJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class junitTestPractice {
	junitPractice j1=new junitPractice();
	 
	//method to test case for expected bigger value and actual bigger value is EQUAL or not
	
	@Test
	@DisplayName("findBiggest")
	public void Biggest() {
		int exp=8;
		int res=j1.biggest(7, 8);
		assertEquals(exp,res);
	}
	
	//method to test case for expected bigger value and actual bigger value is NOTEQUAL or not
	
	@Test
	public void Biggest2() {
		assertNotEquals(7,j1.biggest(7, 8));
	}
	
	//method to test case for expected name and actual name is SAME or not
	
	@Test
	public void checkName() {
		assertSame("Preethi",j1.yourName());
	}
	
	//method to test case for expected name and actual name is NOTSAME or not
	@Test
	public void checkName2() {
		assertNotSame("Junit",j1.yourName());
	}
	
	//method to test case for given condition is TRUE or not
	
	@Test
	public void evenTest() {
		boolean res=j1.even(8);
		assertTrue(res);
		
	}
	//method to test case for given condition is FALSE or not
	
	@Test
	public void oddTest() {
		boolean res=j1.even(7);
		assertFalse(res);
	}
}

