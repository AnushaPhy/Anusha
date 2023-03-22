package com.Page;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public  SelectHotel() {
		PageFactory.initElements((SearchContext) this, driver);
	}
	@FindBy(id = "radiobutton_0")
	private WebElement click;
	
	@FindBy(id = "continue")
	private WebElement continueclick;

	public WebElement getClick() {
		return click;
	}

	public WebElement getContinueclick() {
		return continueclick;
	}

	public WebElement getRadiobutton() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
		
	}


