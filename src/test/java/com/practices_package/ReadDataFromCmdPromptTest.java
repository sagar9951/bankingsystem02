package com.practices_package;

import org.testng.annotations.Test;

public class ReadDataFromCmdPromptTest {

	@Test
	public void readDataTest() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String STAFFID = System.getProperty("staffID");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
	}
}
