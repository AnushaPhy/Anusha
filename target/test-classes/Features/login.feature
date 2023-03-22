Feature: Adactin page validation
Scenario: End to End credentials
Given User is on Adactin Page
When User enters the username,password and loginpage
When User enters the locations,hotel,roomtype,number of rooms,adult room,childroom and click search button in the login page.
When User select the hotel and clicks on select button in select hotels page.
When User enters the first name,last name,Billing Addresss,Credit Card Type,Expiry year,Expiry month, cvv number and clicks on booknowbutton in the hotel page.
Then User verify the booking order.
