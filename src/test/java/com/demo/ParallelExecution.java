package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {
	
	@Parameters({"applications","userName","pass"})
	@Test
	private void tc1(String urlValue,String user,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(urlValue);

		WebElement user1 = driver.findElement(By.id("email"));
		user1.sendKeys("Anusha");
		
		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.sendKeys(("anushaphy"));
	}
	

}
