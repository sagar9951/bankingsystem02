package com.practices_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoIbiboSelectFutureDateTest {
	public static void main(String[] args) throws InterruptedException {
		String monthandyear = "May 2024";
		int date = 15;
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.goibibo.com/");
		 driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		 driver.navigate().refresh();
		 
		 Thread.sleep(1);	 

		//click on calendar
		 driver.findElement(By.xpath("//span[.='Departure']")).click();
		 
	//Select a future month in calendar 
	/*we will use infinte loop using try{} catch{} block like shown below*/
		
		 for(;;) 
		 {	
			 try { //select date
//				 driver.findElement(By.xpath("//div[text()='"+monthandyear+"']/ancestor:://div[@class='DayPicker-Day' and contains(@aria-label,'Oct')]/..//p[.='10']"));
//				 driver.findElement(By.xpath("//div[text()='"+monthandyear+"']/ancestor::div[@class='DayPicker-Day']/descendant::p[text()='"+date+"']"));
				 driver.findElement(By.xpath("//div[text()='May 2024']/../../descendant::div[@class='DayPicker-Day']/p[.='15']"));
				 break;
			 }
			 catch(Exception e){
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			 }
		 }
		 
		 
		 driver.quit();
	}
}
