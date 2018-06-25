package com.cybertek;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnniTest {
	@Test 
	public void addTest() {
		int expected =2;
		Unit unit=new Unit();
		int actual=unit.add(1, 2);
		Assert.assertEquals(actual,expected); //if do sysout, if not sysout ..this is the line doing the test 
		
		
		
		
	}
}
//Junit and TestNg are the unit testing tools for java 
//Junit and TestNg  are tools do same things
//TEst --> annotation that indicatees a test
//assertions -->methods int testng used to doing verification 
//assertEquals-->verifies  two argument are equal 