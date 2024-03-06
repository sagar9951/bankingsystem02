package com.practices_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* paste this dependency  in pom.xml file if you want read from excel file
  <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>
  */
// read ALL the data from excel file
public class ReadFromExcelFileTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\CommonData.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int RowCount = sh.getLastRowNum();  //index will start from 0
		int CelCount = sh.getRow(0).getLastCellNum(); // cell num will return 0+1, just hover cursor over the lastCellNum()
		System.out.println(RowCount);
		System.out.println(CelCount);
		
		
		for(int i=0 ; i <=RowCount ; i++) //row
		{
			for(int j = 0 ; j<CelCount ; j++) //cell
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value +" ");
			}
			System.out.println();
		}
	}
}
