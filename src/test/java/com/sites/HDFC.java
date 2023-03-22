package com.sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
		
		customerId.sendKeys("HelloMaven");
		
		System.out.println("Customer ID/ User ID Is:" + customerId.getAttribute("value"));
		
		driver.quit();
		
		

	}

}
