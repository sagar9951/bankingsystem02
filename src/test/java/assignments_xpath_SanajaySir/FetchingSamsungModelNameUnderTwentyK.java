//package assignments_xpath_SanajaySir;
//
//import java.util.Iterator;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.bankingSystem.genericutils.ExcelUtils;
//import com.bankingSystem.genericutils.FileUtils;
//import com.bankingSystem.genericutils.JavaUtils;
//import com.bankingSystem.genericutils.WebDriverUtils;
//
//public class FetchingSamsungModelNameUnderTwentyK {
//	static WebDriver driver = null;
//	public static void main(String[] args) throws InterruptedException{
//		FileUtils fLib = new FileUtils();
//		ExcelUtils eLib = new ExcelUtils();
//		JavaUtils jLib = new JavaUtils();
//		WebDriverUtils wLib = new WebDriverUtils();
//		
//		//Launching Browser
//		driver = new ChromeDriver();
//		Thread.sleep(1000);	
//		//maximize window
//		wLib.maximizeWindow(driver);
//				
//		driver.get("https://www.amazon.in");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung phones");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		
////		// setting price range under 20000
////		driver.findElement(By.id("high-price")).sendKeys("20000");
////		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
//		
//		Thread.sleep(2000);
//		
//		List<WebElement> modelName = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
//		List<WebElement> prices = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']/descendant::span[@class='a-price-whole']"));
//		
//		int count = 0;
//		for(WebElement price :prices) {
//			String priceText = price.getText().replace(",","");
//			Integer intPrice = Integer.parseInt(priceText);
//			if(intPrice <= 20000) {
//				System.out.print("Model :"+modelName.get(count).getText()+"Price : "+intPrice);
//			}
//			count++;
//			System.out.println();
//		}
//		System.out.println(count);
//	}
//}
