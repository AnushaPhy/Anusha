package com.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement down = driver.findElement(By.className("navFooterBackToTopText"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		
		//WebElement up = driver.findElement(By.className();
		//js.executeScript("arguments[0].scrollIntoView(false)", up);
		


}
}