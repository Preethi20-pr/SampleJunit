package com.sampleJUnit;
import java.util.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

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
	//method to test case for  expected array and actual array are  EQUAL or not
	@Test
	public void testsort() {
	int ar[]= {1,2,3,4};
		int exp[]={1,2,3,4};
		int res[]=j1.arraysort(ar);
		assertArrayEquals(exp,res);
	}
	//method to test case for expected ITERABLE  and actual ITERABLE are  EQUAL or not
	@Test
	public void iterableTest() {
		List<Integer>Listone=new  ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer>Listtwo=new ArrayList<>(Arrays.asList(1,2,3,4));
		assertIterableEquals(Listone,Listtwo);
		
	}
	//method to test case for EXCEPTION
	@Test
	public void checkdiv() {
		assertThrows(ArithmeticException.class,()->j1.div(5,0));
	}
	//method to test case for ALL multiple cases
	@Test
	public void testbig() {
		assertAll(
				()->assertEquals(5,j1.biggest(5,3)),
				()->assertEquals(7,j1.biggest(6,7))
				);
				
		}
	//methods to test case for FAIL cases
	@Test
	public void underTest() {
		fail("code is not completed");
		
	}

}

