package com.baseadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	public static WebDriver driver;
	
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	}
	public static void dropDown(WebElement element,String text) {
		Select s =new Select(element);
		s.selectByVisibleText(text);
		
		
	}
	
	

}
