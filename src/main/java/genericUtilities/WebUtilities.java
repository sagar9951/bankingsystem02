package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUtilities {
	
		public void switchToWindow(WebDriver driver ,String URL) {
			Set<String> set = driver.getWindowHandles();
			Iterator<String> itr = set.iterator();
			while(itr.hasNext())
			{
				String ids = itr.next();
				driver.switchTo().window(ids);
				String url = driver.getCurrentUrl();
				if(url.contains(URL)) {
					break;
				}
			}
		}
		

//		
//		public void excelDataFetch(FileInputStream fi,Workbook wb, Sheet sh) throws EncryptedDocumentException, IOException {
//			 fi = new FileInputStream(".\\src\\test\\resources\\bankWebAppData.xlsx");
//			 wb = WorkbookFactory.create(fi);
//			
//			 sh = wb.getSheet("Staff");
//			String URL = sh.getRow(1).getCell(1).getStringCellValue();
//			String StaffID = sh.getRow(3).getCell(1).getStringCellValue();
//			String StaffPASSWORD = sh.getRow(4).getCell(1).getStringCellValue();
//		}
		public void launchChrome(WebDriver driver) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
}


//public class WebActionUtilities {
//}