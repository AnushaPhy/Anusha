package com.wipro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeClass
	private void beforeClass() {
	System.out.println("Before Class");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
		
		@Test
		private void tc1() {
			System.out.println("Test Case");
		}
		
		@Test
		private void tc2() {
			System.out.println("Test Case 2");
		}
		
		@AfterMethod
		private void afterMethod() {
			System.out.println("After Method");
		}
	
		
}
	


