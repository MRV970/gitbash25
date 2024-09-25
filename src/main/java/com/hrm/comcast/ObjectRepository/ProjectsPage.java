package com.hrm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPage {
	WebDriver driver;
	public ProjectsPage(WebDriver driver) {
		this.driver=driver;
		try {
		PageFactory.initElements(driver, this);
		}catch(Exception e) {
			
		}
	}
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement createProjectBtn;
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

}
