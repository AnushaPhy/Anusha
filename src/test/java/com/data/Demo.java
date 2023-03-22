package com.data;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo extends BaseDriven {
	
	@Test
	private void tc1() throws IOException, InterruptedException {
		browserLaunch();
		
		driver.findElement(By.id("username")).sendKeys(stringData(1,0));
		driver.findElement(By.id("password")).sendKeys(stringData(1,1));
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("location")).sendKeys(stringData(1,2));
		driver.findElement(By.id("hotels")).sendKeys(stringData(1,3));
		driver.findElement(By.id("select room type")).sendKeys(stringData(1,4));
		driver.findElement(By.id("number of rooms")).sendKeys(stringData(1,5));
		driver.findElement(By.id("adults per room")).sendKeys(stringData(1,5));
		driver.findElement(By.id("children per room")).sendKeys(stringData(1,6));
		driver.findElement(By.id("search")).click();
		WebElement drop = null;
		Select s = new Select(drop);
			
		s.selectByVisibleText(stringData(1,2));
		Assert.assertEquals(drop.getAttribute("value"), stringData(1,2));
		
		
		
		
		
	}

}
