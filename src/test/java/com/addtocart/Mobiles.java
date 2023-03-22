package com.addtocart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobiles {
	public static void main(String[]args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		

				
				
				driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
				Set<String> allWindowsId = driver.getWindowHandles();
				System.out.print(allWindowsId);
				
				for(String allWindows : allWindowsId) {
					if(!allWindows.equals(parentWindowId)) {
						driver.switchTo().window(allWindows);
						
						
						
				
		

		
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
		
			}
		
		
		
	}
	}
}
	
	


