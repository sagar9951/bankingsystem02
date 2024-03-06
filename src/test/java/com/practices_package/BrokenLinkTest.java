package com.practices_package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.epfindia.gov.in/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	//get all links
	List<WebElement> allLinks = driver.findElements(By.xpath("//a|//link"));
	System.out.println(allLinks.size());
	
	//use for each loop 
	for(WebElement link: allLinks) {
		String eachLink = link.getAttribute("href");
		URL url = null;
		int statusCode = 0;
		try {
			url = new URL(eachLink); 
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			statusCode = httpConn.getResponseCode();
			if(statusCode>=400 && eachLink!=null)
			{
				System.out.println(eachLink+"----->"+statusCode);
			}
		}
		catch(Exception e) {
			System.out.println(eachLink+"----->"+statusCode);
		}  //try catch
		
	}
}
}
