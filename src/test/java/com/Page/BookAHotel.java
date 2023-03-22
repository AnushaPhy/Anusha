package com.Page;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass{
	public BookAHotel() {
		PageFactory.initElements((SearchContext) this, driver);
	}
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement creditcardnumber;
	
	@FindBy(id = "cc_type")
	private WebElement creditcardtype;
	
	@FindBy(id= "cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id = "book_now")
	private WebElement booknowclick;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknowclick() {
		return booknowclick;
	}
	
	}



