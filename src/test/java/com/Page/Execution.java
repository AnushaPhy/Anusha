package com.Page;

public class Execution extends BaseClass {

	public static void main(String[] args) {
		
		browserLaunch("https://adactinhotelapp.com/BookHotel.php");
		
		AdactinLoginPage a = new AdactinLoginPage();
		inputText(a.getUser(), "abinesh1990");
		inputText(a.getPass(), "Abinesh123");
		buttonClick(a.getLoginBtn());
		
		SearchHotel b=new SearchHotel();
		dropDownText(b.getLocations(), "NewYork");
		dropDownText(b.getHotel(),"Sunshine");
		dropDownText(b.getRoomtype(),"Deluxe");
		dropDownText(b.getnumberofrooms(),"2 Room(s)");
		dropDownText(b.getnumberofrooms(),"2 - Two");
		dropDownText(b.getChildroom(), "2 - Two");
		buttonClick(b.getSubmitbutton());
		
		
		SelectHotel c = new SelectHotel();
		buttonClick(c.getRadiobutton());
		buttonClick(c.getContinueclick());
		
		BookAHotel d = new BookAHotel();
		inputText(d.getFirstname(), "Anusha");
		inputText(d.getLastname(), "Arumugam");
		inputText(d.getAddress(), "Cheyyar");
		inputText(d.getCreditcardnumber(),"1234567891234567");
		dropDownText(d.getCreditcardtype(),"Master Card");
		dropDownText(d.getExpirymonth(),"August");
		dropDownText(d.getExpiryyear(),"2022");
		inputText(d.getCvvnumber(),"123");
		
		
		
		
		
		
		
		

	}

}
