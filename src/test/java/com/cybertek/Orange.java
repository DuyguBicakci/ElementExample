package com.cybertek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {
	WebDriver Driver;
	String firstName;
	String lastName;
	String companyName;
	String jobTitle;
	String phoneNumber;
	Faker data=new Faker();

	@BeforeClass
	public void setUpMethod() {
		WebDriverManager.chromedriver().setup();
		Driver= new ChromeDriver();
		Driver.get("http://www.orangehrm.com/");
		Driver.manage().window().maximize();
		
	}


	@BeforeMethod
	public void Forms() {
		firstName=data.name().firstName();
		lastName=data.name().lastName();
		companyName="Cybertek";
		jobTitle="SDET";
		phoneNumber=data.phoneNumber().phoneNumber();
		
		
		
	}
	@Test
	public void requestaQuote() {
		Driver.findElement(By.xpath(" //a[@class='btn-orange btn btn--primary '][.='Request a Quote'] ")).click();
		Driver.findElement(By.xpath("//*[@id='Form_request_Package']")).sendKeys("Prosessional" + Keys.ENTER);
		Driver.findElement(By.xpath("//div[@class='middleColumn']/input[@name='FirstName']")).sendKeys(firstName);
		//finding last name classic and most used xpath for finding names 
		Driver.findElement(By.xpath("//input[@id='Form_request_LastName']")).sendKeys(lastName);
		//finding Company name 
		Driver.findElement(By.xpath("//*[@id='Form_request_CompanyName']")).sendKeys(companyName);
		//finding industry
		Driver.findElement(By.xpath(" //select [@name='Industry']/option[7]")).click();
		//find the phone number 
		Driver.findElement(By.xpath("//*[@id='Form_request_ContactPhone']")).sendKeys(phoneNumber);
	}
//	@Test
//	public void findCountry() {
//		WebElement country=Driver.findElement(By.id("\"Address_Country\""));
//		Select selectCountry=new Select(country);
//		
//	}
}
