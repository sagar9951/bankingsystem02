package assignments_xpath_SanajaySir;


import java.sql.SQLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CriccBuzz_Run_Test {
	static WebDriver driver =null;
	public static void main(String[] args) throws SQLException, InterruptedException {
		CriccBuzz_Run_Test cricBz = new CriccBuzz_Run_Test();
		cricBz.cricbuzzTest();
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void cricbuzzTest() throws SQLException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.id("live-scores-link")).click();
		//clicking on the link under Live tab under Live Cricket score label
		//fetching the live score
		driver.findElement(By.xpath("//h1[.='Live Cricket Score']/ancestor::div[@ng-init=\"active_match_type= 'international-tab'\"]/descendant::a[@class='text-hvr-underline text-bold'][1]")).click();
		
		driver.findElement(By.xpath("//a[.='Scorecard']")).click();
		// getting the runs data under scoreboard section
		List<WebElement> runs =driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::div[@class=\"cb-col cb-col-8 text-right text-bold\"]"));
//		driver.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
//		driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-min-itm-rw ng-scope']")); // under commentary section

		for (WebElement r : runs) {
			String run = r.getText();
			System.out.println(run);
		}
	}

}




