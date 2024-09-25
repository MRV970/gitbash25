package Projects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.comcast.FileUtility.Excelutility;

public class Providingdata {
	String projectName;
	String ManagerName;

	@DataProvider

	public Object[][] datapro() throws Throwable{
		Excelutility eLib=new Excelutility();
		int row=	eLib.getRowcount("project")+1;
		int cel=eLib.getcolcount("project", row);
		Object[][]data=new Object[row-1][cel];
		for(int i=1;i<row;i++) {
			for(int j=0;j<cel;j++) {
				data[i][j]=eLib.getDataFromExcel("project", i, j);
				//ManagerName=eLib.getDataFromExcel("project", i, j);
				//projectName= data[i][j];
			}
		}
		return data;

	}
	@Test(dataProvider="datapro")
	public void dd(String projectName, String ManagerName) {
		System.out.println(projectName);
		System.out.println(ManagerName);
	}

}
