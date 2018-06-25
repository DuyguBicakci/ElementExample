package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTests {
	@Test
	public void amazonSearchOne() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		String str="Selenium Testing Tools Cookbook ";
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(str+Keys.ENTER);
		
		String xpath="//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal'][.='Selenium Testing Tools Cookbook']";
		//isDisplay -->returns true of the elements we located is display on the page
		//Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java OCA book"+Keys.ENTER);
		System.out.println(driver.findElement(By.xpath(xpath)).isDisplayed());
		
		Assert.assertFalse(1==2);
		Assert.assertFalse(driver.findElement(By.xpath(xpath)).isDisplayed());
		
		Thread.sleep(2000);
		Assert.assertTrue(false);
		try {
			
		
		Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	

}
}
//2.in xpath  . means exact text 
//*[.='Shop now']-->matches with all the elements on th page that has the exact text 'Show now'
//h2.='Selenium TEsting Tools CookBook'
//3.add those xpathhs 
//tag[@id='asdf' and class ='asdasf']--->xpath using two attributes of an element 
//h2[]