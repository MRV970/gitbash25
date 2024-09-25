package Projects;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hrm.comcast.Baseutility.Baseclass;
import com.hrm.comcast.FileUtility.Fileutility;

public class Sample extends Baseclass {
	@Test
	public void demo() throws IOException {
		Fileutility fLib=new Fileutility();
		String Browser=fLib.getdatafromPropertiesfile("browser");
		System.out.println(Browser);
		String Url=fLib.getdatafromPropertiesfile("url");
		System.out.println(Url);
		String Username=fLib.getdatafromPropertiesfile("username");
		System.out.println(Username);
		String Password=fLib.getdatafromPropertiesfile("password");
		System.out.println(Password);
	}
}
