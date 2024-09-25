package com.hrm.comcast.Baseutility;

import java.io.IOException;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.hrm.comcast.Databaseutility.Databaseutility1;
import com.hrm.comcast.FileUtility.Excelutility;
import com.hrm.comcast.FileUtility.Fileutility;
import com.hrm.comcast.FileUtility.Javautility;
import com.hrm.comcast.ObjectRepository.HomePage;
import com.hrm.comcast.ObjectRepository.LoginPage;
import com.hrm.comcast.WebdriverUtility.Webdriver;

public class Baseclass {
	
	public Databaseutility1 dLib=new Databaseutility1();
	
	public Fileutility fLib=new Fileutility();
	public	Excelutility eLib=new Excelutility();
	public	Javautility jLib=new Javautility();
	public	Webdriver wLib=new Webdriver();
	public	WebDriver driver=null;

		@BeforeSuite
		public void configBS() throws SQLException {
			System.out.println("==connect to DB ,Report Config==");
			dLib.getDbConnection();
		}
		
		@BeforeClass
		public void configBC() throws IOException {
			
	      String Browser=	fLib.getdatafromPropertiesfile("browser");
	          System.out.println(Browser);
			if(Browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
				
			}
			else if(Browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			else {
				driver=new ChromeDriver();
			}
			
		}
		
		@BeforeMethod
		public void configBM() throws IOException {
			System.out.println("==Login==");
			LoginPage lp=new LoginPage(driver);
			System.out.println("dgfgg");
			String Url=fLib.getdatafromPropertiesfile("url");
			String Username=fLib.getdatafromPropertiesfile("username");
			String Password=fLib.getdatafromPropertiesfile("password");
			
		    lp.loginToapp(Url, Username, Password);
			
		}
		@AfterMethod
		public void configAM() {
			System.out.println("==logOut==");
			HomePage hp=new HomePage(driver);
			hp.getLogoutlink();
		}
		
		
		@AfterClass
		public void configAC() throws SQLException {
			
			driver.quit();
			
		}
		@AfterSuite
		public void configAS() throws SQLException {
			dLib.closeDbConnection();
			
			 
		}

}
