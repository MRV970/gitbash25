package Projects;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.comcast.Baseutility.Baseclass;
import com.hrm.comcast.FileUtility.Excelutility;
import com.hrm.comcast.ObjectRepository.CreateProjectPage;
import com.hrm.comcast.ObjectRepository.HomePage;
import com.hrm.comcast.ObjectRepository.ProjectVerificationPage;
import com.hrm.comcast.ObjectRepository.ProjectsPage;
import com.hrm.comcast.WebdriverUtility.Webdriver;

public class project1 extends Baseclass{
	
//	@DataProvider(name = "createProjectTest")
//	public Object[][] datapro() throws Throwable{
//		Excelutility eLib=new Excelutility();
//		System.out.println("dfghj");
//
//	int row=	eLib.getRowcount("project");
//	int cel=eLib.getcolcount("project", row);
//	Object[][]data=new Object[row][cel];
//		for(int i=1;i<=row;i++) {
//			for(int j=0;j<=cel;j++) {
//			data[i][j]=eLib.getDataFromExcel("project", i, j);
//			
//		}
//		}
//		return data;
//
//	}
	
	
	@Test(dataProvider = "datapro")
	public void createProjectTest(String projectName,String ManagerName)throws Throwable{
		
		
		HomePage hp=new  HomePage(driver);
		hp.getProjectlink().click();
		
		ProjectsPage pp=new ProjectsPage(driver);
		pp.getCreateProjectBtn().click();
		CreateProjectPage cpp=new CreateProjectPage(driver);
		cpp.createProject(projectName, ManagerName);
		cpp.getCreateBtn().click();
		ProjectVerificationPage pv=new ProjectVerificationPage(driver);
		pv.getDropdownEdt().click();
		Webdriver wLib=new Webdriver();
		wLib.selectbyIndex(pv.getDropdownEdt(), 1);
		pv.getProjectNameEdt().sendKeys(projectName);
		
		
		
		
		
	}
	
	
}
	
	
	//String projectName =eLib.getDataFromExcel("project", 1, 1);
		//	String ManagerName=eLib.getDataFromExcel("project", 1, 2)+jLib.getRandomNo();    

   


