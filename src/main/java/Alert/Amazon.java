package Alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
	private void inspect() throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title- " + title);
		
		String Url = driver.getCurrentUrl();
		System.out.println("Url- " + Url);
		
		WebElement mobiles = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		
		Actions acc = new Actions(driver);
		acc.moveToElement(mobiles).perform();
		acc.contextClick().perform();
		
		Robot r=new Robot();
		for(int i=0;i<=5;i++);
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
		
		
	
		
		
	}
	

}
