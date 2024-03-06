package com.practices_package;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
// write  data into excel file  
/*NOTE --------- press (ctrl and -) to delete old data 
 * into cell before writing in those cells otherwise you will get NullPointerException*/
public class WriteDataIntoExcelFileTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\CommonData.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		
/*NOTE :---if once you have created the row or cell no need to again create it just use getRow() or getSheet()   
		 * */
//		wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue("Audi");
//		wb.getSheet("Sheet1").createRow(5).createCell(1).setCellValue("Ahemdabad");  
/*  this will produce illegalargumentException since we have once created the row but then in second line we are 
 * again creating the row ,, we just need to use getRow() like below*/
		
		wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue("Audi");
		wb.getSheet("Sheet1").getRow(5).createCell(1).setCellValue("Ahemdabad");
//		wb.createSheet("Sheet2").createRow(0).createCell(0).setCellValue("AUDI");
//		wb.getSheet("Sheet2").getRow(0).createCell(1).setCellValue("Ahemdabad");
/*NOTE :=---- if you want to wwrite numercal values then put a sing inverted comma in front of the Integer 
 * it will be converted to string data (in excel there will be a green mark on top left corner of the cell)*/		
		
		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\CommonData.xlsx");
		
		wb.write(fout);
		wb.close();
	}
}
