package Projects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.comcast.ObjectRepository.HomePage;

public class data {
	//@Test(dataProvider="getData")
//	public void LoginTest(String projName,String ProjectManagerName,String status) throws Throwable {
//		HomePage hp=new HomePage(driver);
//		hp.getProjectlink().click();
//		hp.getCreateprojectBtn().click();
//		hp.getProjectnameInputBtn().click();
//		String ProjectName=eu.getDataFromExcelFile("Sheet1", 1,0)+ju.getRandomNumber();
//		hp.getProjectnameInputBtn().sendKeys(ProjectName);
//		hp.getProjectManagerInput().click();
//		String ProjectManagerName=eu.getDataFromExcelFile("Sheet1", 1, 1)+ju.getRandomNumber();
//		hp.getProjectManagerInput().sendKeys(ProjectManagerName);
//		
//		hp.getDropdownbtn().click();
//		wdu.select(hp.getDropdownbtn(),"Created");
//		hp.getAddProjectBtn().click();
//		hp.getProjectDropDownBtn().click();
//		wdu.select(hp.getProjectDropDownBtn(),"Search by Project Name");
//		hp.getProjectSearchFiled().sendKeys(ProjectName);
//		du.getConnection();
//		WebElement proName=driver.findElement(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr/td[1]"));
//		if(ProjectName.equals(proName)) {
//			System.out.println("Project is created");
//		}
//		else {
//			System.out.println("Project is not created");
//		}
//		eu.setDataIntoExcel("Sheet2",1, 0, ProjectName);
//	}
//	@DataProvider
//	public Object[][] getData() throws Throwable {
//		int rowcount=eu.getRowCount("Sheet1")+1;
//		int clocount=eu.getcolcount("Sheet1", rowcount);
//		Object[][] objectArr=new Object[eu.getRowCount("Sheet1")][eu.getcolcount("Sheet1", rowcount)];
//		for(int i=1;i<rowcount;i++) {
//			for(int j=0;j<=clocount;j++) {
//				objectArr[i][j]=eu.getDataFromExcelFile("Sheet1", i, j);
//			}
//		}
//		return objectArr;
//	}
//}l

}
