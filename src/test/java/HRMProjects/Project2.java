package HRMProjects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hrm.comcast.Baseutility.Baseclass;
import com.hrm.comcast.ObjectRepository.CreateProjectPage;
import com.hrm.comcast.ObjectRepository.HomePage;
import com.hrm.comcast.ObjectRepository.ProjectVerificationPage;
import com.hrm.comcast.ObjectRepository.ProjectsPage;
import com.hrm.comcast.WebdriverUtility.Webdriver;

public class Project2 extends Baseclass{
	@Test
	public void createtProject() throws EncryptedDocumentException, IOException {
		
	String projectName=eLib.getDataFromExcel("project", 1, 1)+jLib.getRandomNo();
	String ManagerName=eLib.getDataFromExcel("project", 1, 2)+jLib.getRandomNo();
	HomePage hp=new HomePage(driver);
	hp.getProjectlink().click();
	ProjectsPage pp=new ProjectsPage(driver);
	pp.getCreateProjectBtn().click();
	CreateProjectPage cpp=new CreateProjectPage(driver);
	cpp.createProject(projectName, ManagerName);
	cpp.getCreateBtn().click();
	ProjectVerificationPage pv=new ProjectVerificationPage(driver);
	pv.getDropdownEdt().click();
	
	wLib.selectbyIndex(pv.getDropdownEdt(), 1);
	pv.getProjectNameEdt().sendKeys(projectName);
	WebElement search=driver.findElement(By.xpath("//tr[@class='tr']"));
	if(search.isDisplayed()) {
		System.out.println("project is created");
	}
	String pname=projectName;
	String mname=ManagerName;
	eLib.setDataIntoExcel("project", 1, 5, pname);
	eLib.setDataIntoExcel("project", 1, 6, mname);
	System.out.println("data added");
	
	}
}
