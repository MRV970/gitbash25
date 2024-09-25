package HRMProjects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.comcast.FileUtility.Excelutility;

public class Dataproviderclass {
	
	
	@DataProvider
	public Object[][] providingdata() throws Throwable{
		Excelutility eLib=new Excelutility();
		int row=	eLib.getRowcount("project")+1;
		int cel=eLib.getcolcount("project", row);
		Object[][]data=new Object[row-1][cel];
		for(int i=1;i<row;i++) {
			for(int j=1;j<cel;j++) {
				data[i][j]=eLib.getDataFromExcel("project", i, j);
	}

}
	
		return data;
	}
	
}
