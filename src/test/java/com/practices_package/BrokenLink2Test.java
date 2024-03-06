package com.practices_package;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2Test {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.icicibank.com/homepage");
		driver.get("https://www.wikihow.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a | //link"));
		System.out.println("No. of links : "+allLinks.size());
		
		for(WebElement link : allLinks)
		{
			String eachLink = link.getAttribute("href");
			URL url = new URL(eachLink);
			HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
			int statusCode = httpCon.getResponseCode();
			
			if(statusCode >=400 && eachLink!= null)
			{
				System.out.println("Fail : "+eachLink+"--->"+statusCode);
			}else if(statusCode == 200) {
				System.out.println("Pass : "+eachLink+"--->"+statusCode);
			}else {
				System.out.println("==== : "+eachLink+"--->"+statusCode);
			}
		}
		
		driver.quit();
	}
}
