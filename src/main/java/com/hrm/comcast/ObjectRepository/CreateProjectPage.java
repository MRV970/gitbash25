package com.hrm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage {
	WebDriver driver;
	public CreateProjectPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateBtn() {
		return createBtn;
	}

	@FindBy(name="projectName")
	private WebElement projectNameEdt;
	@FindBy(name="createdBy")
	private WebElement managerEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createBtn;
	public WebElement getProjectNameEdt() {
		return projectNameEdt;
	}
	public WebElement getManagerEdt() {
		return managerEdt;
	}
	
	public void createProject(String projectname,String Managername) {
		try {
		projectNameEdt.sendKeys(projectname);
		managerEdt.sendKeys(Managername);
		createBtn.click();
		}catch(Exception e){
			
		}
	}

}
