package com.Page;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	public static WebElement getLoc1;

	public SearchHotel(){
		PageFactory.initElements((SearchContext) this, driver);
	}
	@FindBy(id = "location")
	private WebElement loc;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement numberofrooms;
	
	@FindBy(id = "adult_room")
	private WebElement adultperroom;
	
	@FindBy(id = "child_room")
	private WebElement childperroom;
	
	@FindBy(id = "Submit")
	private WebElement searchClick;

	public WebElement getLoc1() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getRoomtype() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getnumberofrooms() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getAdultroom() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getChildroom() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getLoc() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getnumberofrooms1() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getChildroom1() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getSubmitbutton() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getLocations() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}


