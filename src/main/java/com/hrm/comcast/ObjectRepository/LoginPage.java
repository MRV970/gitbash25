package com.hrm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		try {
			PageFactory.initElements(driver, this);
	}catch(Exception e) {
		
	}
	}
	
	 @FindBy(id="username")
	private WebElement usernameEdt;
	@FindBy(id="inputPassword")
	private WebElement passwordEdt;
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signinBtn;
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getSigninBtn() {
		return signinBtn;
	}
	public void logintoApp(String username,String password) {
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		signinBtn.click();
		
	}
	public void loginToapp(String Url,String Username,String Password) {
		
		driver.get(Url);
		driver.manage().window().maximize();
		
		usernameEdt.sendKeys(Username);
		passwordEdt.sendKeys(Password);
		signinBtn.click();
	}
}
