package com.cybertek;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeClass
	public void setUpClass() {
		System.out.println("runs ones before evrything in this class");
	}
	
	@BeforeMethod //runs before every methods 
	public void setUpMethod() {
		System.out.println("runs before every method");
		
	}
	@Test
	public void testOne() {
		System.out.println("First one");
	}
	@Test
	public void testSecond() {
		System.out.println("Second one ");
	}
	@AfterMethod// doesnt matter test  runs or not always execute 
	public void teardownMethod() {
		System.out.println("runs after every method");
	}
	@AfterClass
	public void tearDownClass() {
		System.out.println("runs afte everthing in this methods");
	}

}
