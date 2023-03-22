package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriven {
	public static WebDriver driver;
	public static void browserLaunch() throws InterruptedException{

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
		
public static String stringData(int row, int cell) throws IOException {
	File loc = new File("C:\\Users\\Anusha\\eclipse-workspace\\DemoMaven\\DataDri\\Selenium.xlsx");
	FileInputStream input = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(input);
	Sheet s = w.getSheet("Firstpage");
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	String stringCellValue = c.getStringCellValue();
	return stringCellValue;
	
	}
public static String numericData(int row,int cell) throws IOException {
	File loc = new File("C:\\Users\\Anusha\\eclipse-workspace\\DemoMaven\\DataDri\\Selenium.xlsx");
	FileInputStream input = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(input);
	Sheet s = w.getSheet("Firstpage");
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	double d = c.getNumericCellValue();
	long l = (long)d;
	String numericValue = String.valueOf(1);
	return numericValue;
}
public static void btnClick(WebElement element,String text ) {
	element.sendKeys(text);

}
public static void dropdown(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
}
public static void getText(WebElement element) {
System.out.println(element.getText());
	
}

    	
    	
    }

    	
    

		
	
		
		

	
	


