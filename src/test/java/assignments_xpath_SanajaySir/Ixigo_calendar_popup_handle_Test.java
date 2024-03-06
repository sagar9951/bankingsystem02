package assignments_xpath_SanajaySir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ixigo_calendar_popup_handle_Test {
	static WebDriver driver = null;
	public static void main(String[] args) {
		Ixigo_calendar_popup_handle_Test ixigo = new Ixigo_calendar_popup_handle_Test();
		ixigo.ixigoTest();
	}
	
	public void ixigoTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(null));
		Actions action = new Actions(driver);

		driver.get("https://www.ixigo.com/");
//		WebElement clk = driver.findElement(By.xpath("//p[@data-testid='originId']"));
//		action.click(clk).perform();
//		clk.sendKeys("Mumbai");
//		action.sendKeys(clk, "mumbai").perform();
//		action.click(clk).perform();
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//input[contains(@value,'Bengaluru')]")).clear();
//		wait.until(ExpectedConditions.elementToBeClickable(click));
//		driver.switchTo().activeElement().sendKeys("mumbai");
		
		driver.findElement(By.xpath("flex-1 h-full flex flex-col justify-center px-15 py-10 ")).sendKeys("Delhi");
		driver.findElement(By.xpath("flex items-center relative hover:bg-primary-over px-20 py-10 gap-10 group list-sm max-w-screen-sm gap-15 py-15 px-20 ")).click();
		
		action.sendKeys(Keys.TAB).click().perform();
		driver.findElement(By.xpath("flex-1 h-full flex flex-col justify-center px-15 py-10 ")).sendKeys("Mumbai");
		driver.findElement(By.xpath("flex items-center relative hover:bg-primary-over px-20 py-10 gap-10 group list-sm max-w-screen-sm gap-15 py-15 px-20 ")).click();
		
		
	}
}
