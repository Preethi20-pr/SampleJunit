package com.sampleJUnit;
import java.util.*;

public class junitPractice {
	//method for biggest
	public int biggest(int a, int b)
	{
		int c=a>b?a:b;
		return c;
	}
	// method for your name
	public String yourName() {
		return "Preethi";
	}
	//method for even
	public boolean even(int a) {
		return a%2==0;
	}
	//method for sorting an array
	public int[] arraysort(int js[]) {
		Arrays.sort(js);
		return js;
	}
	public int div(int a, int b) {
    	return a/b;
    }
	
}

