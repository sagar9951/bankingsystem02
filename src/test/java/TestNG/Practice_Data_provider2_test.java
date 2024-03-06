package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice_Data_provider2_test {

	@Test(dataProvider = "travelDetails")
	public void getData(String src, String dest, int price) {
		System.out.println("From "+src+", To : "+dest+"Cost is : "+price);
	}
	
	@DataProvider(name = "travelDetails")
	public Object[][] storeData(){
		//data for 1 st row
		Object[][] obj = new Object[3][3];
		obj[0][0] = "Jaipur";
		obj[0][1] = "Bangalore";
		obj[0][2] = 2000;
		
		//data for 2nd row
		obj[1][0] = "Indore";
		obj[1][1] = "Delhi";
		obj[1][2] = 20;
		
//		//data for 3rd row
//		obj[2][0] = "Kerala";
//		obj[2][1] = "Pune";
//		obj[2][2] = 1300;
		
		return obj;
	}
	
	@DataProvider
	public Object[][] excelData() throws Throwable{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\bankWebAppData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("DataProvider");
		int lastRow = sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRow][lastCell];
		
		for(int i=0 ; i<lastRow ; i++) {
			for(int j = 0; j<lastCell ; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}

