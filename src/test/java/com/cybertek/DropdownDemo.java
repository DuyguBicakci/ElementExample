package com.cybertek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {
    public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialehtml.com/en/html-tutorial-drop-down-lists-menu");
	//1.find select tag
	WebElement selecttag =driver.findElement(By.name("my_html_select_box"));
	//2.create select object fromt he select tag
	Select list=new Select(selecttag);
	//getFristSelectedOptions()-->RETURNS the slected element
	
	//print the seldcted calue:option1
	WebElement selected =list.getFirstSelectedOption();
	System.out.println(list.getFirstSelectedOption().getText());
	List<WebElement> options=list.getOptions();
	System.out.println("---------");
	for(WebElement webElement:options) {
		System.out.println(webElement.getText());
		System.out.println("selected:\t"+list.getFirstSelectedOption().getText());
		
		
		list.selectByIndex(2);
		System.out.println("\"selected:\\t\"+list.getFirstSelectedOption().getText());");
		System.out.println();
		Select secondList=new Select(driver.findElement(By.cssSelector("select[multiple='yes']")));
		secondList.selectByVisibleText("New york");
		secondList.selectByVisibleText("Madrid");
		List<WebElement> allSelectedOptions=secondList.getAllSelectedOptions();
		for(WebElement webElement1:allSelectedOptions) {
			
			System.out.println(webElement1.getText());
			
		}
		System.out.println(allSelectedOptions.size());
		secondList.deselectAll();
		allSelectedOptions=secondList.getAllSelectedOptions();
		
}
}}
