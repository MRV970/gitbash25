package com.hrm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Projects']")
	private WebElement projectlink;
	@FindBy(linkText="Employees")
	private WebElement employeelink;
	@FindBy(className="user-icon")
	private WebElement logoutlink;
	public WebElement getProjectlink() {
		return projectlink;
	}
	public WebElement getEmployeelink() {
		return employeelink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}

}
