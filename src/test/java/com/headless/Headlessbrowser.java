package com.headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbrowser {

	@Test
	private void headLess() {

		ChromeOptions c = new ChromeOptions();
		c.addArguments("headLess");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		
		 WebElement user = driver.findElement(By.id("email"));
		  user.sendKeys("Anusha");
		  
		  WebElement pass = driver.findElement(By.id("pass"));
		 pass.sendKeys("anusha20");
		  
		 

	}

}
