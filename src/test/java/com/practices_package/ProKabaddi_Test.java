package com.practices_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProKabaddi_Test {
	public static void main(String[] args) {
		ProKabaddi_Test kabadi = new ProKabaddi_Test();
		kabadi.proKabaddi_Test();
	}
	public  void proKabaddi_Test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.prokabaddi.com/");
		driver.findElement(By.xpath("//a[@title=\"Standings\"]")).click();

		List<WebElement> pts = driver.findElements(By.xpath("//div[@class=\"table-data points\"]"));
		List<WebElement> teams = driver.findElements(By.xpath("//div[@class=\"table-data team\"]"));
		int i = 0;
		for (WebElement points : pts) {
			String score = points.getText();
			System.out.println(teams.get(i).getText() + "------->" + score);
			i++;
		}
//	System.out.println(i);
}
}