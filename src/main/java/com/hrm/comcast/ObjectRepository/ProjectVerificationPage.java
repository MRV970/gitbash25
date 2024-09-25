package com.hrm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.comcast.WebdriverUtility.Webdriver;

public class ProjectVerificationPage {
	WebDriver driver;
	public ProjectVerificationPage(WebDriver driver) {
		this.driver=driver;
		try {
		PageFactory.initElements(driver, this);
		}catch(Exception e) {
			
		}
	}
	//Webdriver wLib =new Webdriver();
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	private WebElement dropdownEdt;
	public WebElement getDropdownEdt() {
		return dropdownEdt;
		
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement ProjectNameEdt;
	
	public WebElement getProjectNameEdt() {
		return ProjectNameEdt;
	
	
		
	}
	
		
	

}
