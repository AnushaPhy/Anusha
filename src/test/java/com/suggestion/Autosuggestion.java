package com.suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {
	@Test
	private void tc1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("chennai");
		Thread.sleep(6000);
		List<WebElement> auto = driver.findElements(By.xpath("//*[@class='mkHrUc']//li"));
		int size=auto.size();
		System.out.println(size);
		auto.get(size-2).click();
		
		
				

	}
}