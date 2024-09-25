package com.hrm.comcast.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	public String getdatafromPropertiesfile(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream("./Commondata/HRM.properties");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		
		
		
		return data;
	}
     
}
