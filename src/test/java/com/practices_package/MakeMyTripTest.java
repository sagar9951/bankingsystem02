package com.practices_package;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MakeMyTripTest {
	public static void main(String[] args) throws InterruptedException {
		String monthandyear = "October 2024";
		int date = 15;
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.makemytrip.com/");
		 Thread.sleep(4);
//		 //close ad popoup
//		 driver.switchTo().frame( driver.findElement(By.xpath("//div[@class='container']")));
//		 //close add buuton
//		 driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		 
		 Actions act = new Actions(driver);
		 act.doubleClick().click().perform();
		 Thread.sleep(3);
		 act.moveByOffset(50, 50).click().perform();
		 driver.navigate().refresh();
		 
		 Thread.sleep(3);

		 //click radio button for one-way trip
		 driver.findElement(By.xpath("//li[text()='One Way']/..//span[@class='tabsCircle appendRight5']")).click();
		 Thread.sleep(2);
		 
		 //click on calendar
		 driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='Departure']")).click();
//		 driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='16']")).click();
//		 //during two-way trip
//		 driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='Return']")).click();
//		 driver.findElement(By.xpath("//div[@aria-disabled='false']/..//div[@class='dateInnerCell']/..//p[text()='25']")).click();
//		 driver.findElement(By.xpath("//a[text()='Search']")).click();
		 
	//Select a future month in calendar 
	/*we will use infinte loop using try{} catch{} block like shown below*/
		
		 for(;;)
		 {	
			 try { //select date
				 driver.findElement(By.xpath("//div[text()='"+monthandyear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='16']"));
				 break;
			 }
			 catch(Exception e){
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			 }
		 }
		 
		 
	}
}
