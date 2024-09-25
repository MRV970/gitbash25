package com.hrm.comcast.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flipkartHomepage {
	@FindBy(xpath="//span[text()='Grocery']")
	private WebElement grocerylink;
	@FindBy(xpath="//span[text()='Mobiles']")
	private WebElement mobilelink;
	@FindBy(xpath="//span[text()='Appliances']")
	private WebElement appliancelink;
	@FindBy(xpath="//span[text()='Travel']")
	private WebElement travellink;
	
	

}
