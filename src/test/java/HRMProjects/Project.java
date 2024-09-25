package HRMProjects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.comcast.Baseutility.Baseclass;
import com.hrm.comcast.FileUtility.Excelutility;
import com.hrm.comcast.ObjectRepository.CreateProjectPage;
import com.hrm.comcast.ObjectRepository.HomePage;
import com.hrm.comcast.ObjectRepository.ProjectVerificationPage;
import com.hrm.comcast.ObjectRepository.ProjectsPage;
import com.hrm.comcast.WebdriverUtility.Webdriver;

public class Project extends Baseclass{
	
	@Test(dataProvider ="providingdata" )
	public void createProjectTest(String projectName,String ManagerName) throws SQLException {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		HomePage hp=new HomePage(driver);
		hp.getProjectlink().click();
		ProjectsPage pp=new ProjectsPage(driver);
		pp.getCreateProjectBtn().click();
		CreateProjectPage cpp=new CreateProjectPage(driver);
		cpp.createProject(projectName, ManagerName);
		try {
		cpp.getCreateBtn().click();
		}catch(Exception e){
			
		}
		ProjectVerificationPage pv=new ProjectVerificationPage(driver);
		try {
		pv.getDropdownEdt().click();
		
		
		Webdriver wLib=new Webdriver();
		wLib.selectbyIndex(pv.getDropdownEdt(), 1);
		pv.getProjectNameEdt().sendKeys(projectName);
	}catch(Exception e) {
	}
	    
        ResultSet result = dLib.executeSelectQuery("select * from project");
    	boolean flag=false;
        while(result.next()) {
        	if(result.getString(4).equals(projectName)) {
   
        		flag=true;
        		break;
        	}
        }
        if(flag==true) {
        	System.out.println("project is created");
        }else {
        	System.out.println("not created");
        
	}
	}
	@DataProvider
	public Object[][] providingdata() throws Throwable{
		Excelutility eLib=new Excelutility();
		int row=	eLib.getRowcount("project");
		
		Object[][]data=new Object[row][2];
		for(int i=0;i<row;i++) {
			data[i][0]=eLib.getDataFromExcel("project", i, 0);
			data[i][1]=eLib.getDataFromExcel("project", i, 1);
		}
		

	
		return data;
	}
	

}
