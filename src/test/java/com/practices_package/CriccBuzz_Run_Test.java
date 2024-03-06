package com.practices_package;


import java.sql.SQLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CriccBuzz_Run_Test {
	public static void main(String[] args) throws SQLException {
		CriccBuzz_Run_Test cricBz = new CriccBuzz_Run_Test();
		cricBz.cricbuzzTest();
	}
	
	public void cricbuzzTest() throws SQLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.id("live-scores-link")).click();
		driver.findElement(By.xpath(
				"//h1[.='Live Cricket Score']/ancestor::div[@ng-init=\"active_match_type= 'international-tab'\"]/descendant::a[@class=\"text-hvr-underline text-bold\"][1]"))
				.click();
		driver.findElement(By.xpath("//a[.='Scorecard']")).click();
		List<WebElement> runs = driver.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]"));



		for (WebElement r : runs) {
//			runs.get(i);
			String run = r.getText();
			System.out.println(run);
		}
	}

}




