package com.scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement down = driver.findElement(By.className("main-heading"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
		WebElement up = driver.findElement(By.className("row col-sm-12 h_head2"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
		
		
		
	}
}
