package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Case 1

//Go to amazon
//search for something
//
//Test Case 2
//Go to Google
//Search for something

public class ATestCleansUp {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void seachGoogle() {

		driver.get("https://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium book " + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("selenium book"));

	}

	@Test
	public void searchAmazon() {

		driver.get("https://www.amazon.com");
		driver.findElement(By.id("teotabsearchtextbox")).sendKeys("father days gift" + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("father days gift"));
		driver.close();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}
}
