package assignments_xpath_SanajaySir;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class OlympicTest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		OlympicTest tokyo = new OlympicTest();
		tokyo.olympicTest();
	}
	
	public void olympicTest()
	{
		//fetching the country names and their medals during tokyo olypics 2020
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> medals = driver.findElements(By.xpath("//div[@title='Silver']"));
		List<WebElement> countries = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		int i = 0;
		for (WebElement ref : medals) {
			String silver = ref.getText();
			System.out.println(countries.get(i).getText() + "------->" + silver);
			i++;
		}
//		System.out.println(i);
	}
}

