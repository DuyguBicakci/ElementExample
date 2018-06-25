package com.cybertek;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AssertionsDemo {
	@AfterMethod
	public void tearDown9(){
		System.out.println("cleaning up");
		
	}
	@Test
	public void testOne() {
		//String a="asd";
		//String b="bgfv";
		//if assertion fails the rest will not run 
		System.out.println("asserting first");
		
		Assert.assertTrue(false);
		System.out.println("done asserting first");
	}
	@Test
	public void testTwo() {
		
		System.out.println("asserting first");
		
		Assert.assertTrue(true);
		System.out.println("done asserting first");
	}
	

}
