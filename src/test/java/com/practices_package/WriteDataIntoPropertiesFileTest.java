package com.practices_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertiesFileTest {
	public static void main(String[] args) throws IOException {
		/* we are creating a new empty properties file first
		 *  if we use the CommonData.properties file then it will overwrite the data there	*/
		FileInputStream fins = new FileInputStream(".\\src\\test\\resources\\WriteData.properties");
		Properties pobj = new Properties();
		
		pobj.setProperty("BROWSER", "chrome");
		pobj.setProperty("URL", "http://rmgtestingserver/domain/Online_Banking_System");
		pobj.setProperty("staffID", "120001");
		pobj.setProperty("password", "password");
		
		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\WriteData.properties");
		pobj.store(fout, "write dtaa"); //put any message for string argument
		
		System.out.println("dat.properties file updated");
	}
}
