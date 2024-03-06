package com.practices_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromPropertyFileTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;
		
		FileInputStream fins = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj = new Properties();
		
		pobj.load(fins);
		
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
//		String StaffLink = pobj.getProperty("stafflink");
		String STAFFID = pobj.getProperty("staffid");
		String PASSWORD = pobj.getProperty("password");
		
		System.out.println(URL);
		System.out.println(STAFFID);
		System.out.println(PASSWORD);
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else {
			System.out.println("invalid browser ");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Staff Login']")).click();
		driver.findElement(By.name("staff_id")).sendKeys(STAFFID);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.name("staff_login-btn")).click();
		
//		Thread.sleep(1000);
//		driver.quit();
		
	}
}
